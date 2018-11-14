package com.madless.simpledb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.*
import android.widget.LinearLayout.HORIZONTAL
import com.madless.simpledb.gen.RequestLexer
import com.madless.simpledb.gen.RequestParser
import com.madless.simpledb.model.Column
import com.madless.simpledb.statement.CreateStatement
import com.madless.simpledb.statement.InsertStatement
import com.madless.simpledb.statement.SelectStatement
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import java.lang.Exception
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {

    lateinit var tableLayout: TableLayout
    lateinit var requestEditText: EditText
    lateinit var performButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tableLayout = findViewById(R.id.tableLayout)
        requestEditText = findViewById(R.id.requestEditText)
        performButton = findViewById(R.id.performButton)

        val columns = ArrayList<Column>()
        columns.add(Column("id", "INT"))
        columns.add(Column("name", "TEXT"))
        columns.add(Column("lastName", "TEXT"))
        columns.add(Column("age", "INT"))
        columns.add(Column("gender", "TEXT"))
        columns.add(Column("job", "TEXT"))
        columns.add(Column("other", "TEXT"))
        val createStatement = CreateStatement("person", columns)

        val insertStatement1 = InsertStatement("person", arrayListOf("1", "John", "Peterson", "17", "Male", "Plumber", "-"))
        val insertStatement2 = InsertStatement("person", arrayListOf("2", "Jane", "Peterson", "18", "Female", "Manager", "-"))
        val insertStatement3 = InsertStatement("person", arrayListOf("3", "Tom", "Smith", "19", "Male", "Developer", "Self-confident"))
        val insertStatement4 = InsertStatement("person", arrayListOf("4", "Jack", "Smith", "29", "Male", "Builder", "-"))
        val insertStatement5 = InsertStatement("person", arrayListOf("5", "Ann", "Smith", "22", "Female", "Unemployed", "Has good sense of humor"))
        val insertStatement6 = InsertStatement("person", arrayListOf("6", "Anton", "Valeev", "28", "Male", "Unemployed", "-"))

        val selectStatement1 = SelectStatement("person")

        val selectStatement2 = SelectStatement("person", arrayListOf("id", "name"), "id > 1")

        try {

            val text = "select * from person where id = 1;"
            val stream = text.byteInputStream(StandardCharsets.UTF_8)
            val inputStream = ANTLRInputStream(stream)
            val requestLexer = RequestLexer(inputStream)
            val commonTokenStream = CommonTokenStream(requestLexer)
            val requestParser = RequestParser(commonTokenStream)

            val commandResult = requestParser.parse()
            val generatedSelectStatement = commandResult?.statement as SelectStatement
            Log.d("madtag", "generatedSelectStatement $generatedSelectStatement")

            DataBaseHandler.init(this)
            DataBaseHandler.dropAllTables()
            DataBaseHandler.createTable(createStatement)
            Log.d("madtag", "tables ${DataBaseHandler.getAllTables()}")
            DataBaseHandler.insert(insertStatement1)
            DataBaseHandler.insert(insertStatement2)
            DataBaseHandler.insert(insertStatement3)
            DataBaseHandler.insert(insertStatement4)
            DataBaseHandler.insert(insertStatement5)
            DataBaseHandler.insert(insertStatement6)
            val result = DataBaseHandler.select(generatedSelectStatement)
//            DataBaseHandler.select(selectStatement2)
            DataBaseHandler.dropAllTables()
            Log.d("madtag", "tables after drop ${DataBaseHandler.getAllTables()}")

            fillTable(result)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun fillTable(result: ArrayList<Map<String, String>>) {
        for ((i, row) in result.withIndex()) {
            val tableRow = TableRow(this)
            tableRow.layoutParams = TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                    TableLayout.LayoutParams.WRAP_CONTENT)
            tableRow.setBackgroundResource(R.drawable.bg_with_stroke)
            for ((j, column) in row.values.withIndex()) {
                val textView = TextView(this)
                textView.text = column
                textView.setSingleLine(true)
                textView.setBackgroundResource(R.drawable.bg_with_stroke)
                textView.gravity = Gravity.CENTER_HORIZONTAL
                tableRow.addView(textView, j)
                (textView.layoutParams as? TableRow.LayoutParams)!!.weight = 1f
            }
            tableLayout.addView(tableRow, i)
        }
        tableLayout.requestLayout()
    }
}
