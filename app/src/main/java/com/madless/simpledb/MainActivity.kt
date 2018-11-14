package com.madless.simpledb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.*
import com.madless.simpledb.gen.RequestLexer
import com.madless.simpledb.gen.RequestParser
import com.madless.simpledb.model.Column
import com.madless.simpledb.statement.*
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

        performButton.setOnClickListener {
            try {
                val text = requestEditText.text.toString()
                val statement = getStatement(text)
                val result = statement.execute()
                try {
                    val selectResult = result as ArrayList<Map<String, String>>
                    fillTable(selectResult)
                } catch (e: Exception) {
                    fillTable(null)
                    e.printStackTrace()
                }

            } catch (e: Exception) {
                e.printStackTrace()
                Log.d("madtag", "Error ${e.message}")
            }
        }

        DataBaseHandler.init(this)
        DataBaseHandler.dropAllTables()

        val createStatement = getStatement("create table person (id int, name text, lastName text, age int);") as CreateStatement
        val insertStatement1 = getStatement("insert into person values (1, 'John', 'Smith', 19);") as InsertStatement
        val insertStatement2 = getStatement("insert into person values (2, 'Jane', 'Smith', 22);") as InsertStatement

        DataBaseHandler.createTable(createStatement)
        DataBaseHandler.insert(insertStatement1)
        DataBaseHandler.insert(insertStatement2)
    }

    private fun getStatement(request: String): Statement<Any> {
        val stream = request.byteInputStream(StandardCharsets.UTF_8)
        val inputStream = ANTLRInputStream(stream)
        val requestLexer = RequestLexer(inputStream)
        val commonTokenStream = CommonTokenStream(requestLexer)
        val requestParser = RequestParser(commonTokenStream)

        val commandResult = requestParser.parse()
        val generatedSelectStatement = commandResult?.statement as Statement<Any>
        return generatedSelectStatement
    }

    private fun fillTable(result: ArrayList<Map<String, String>>?) {
        tableLayout.removeAllViews()
        result?.let { result ->
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
        }
        tableLayout.requestLayout()
    }
}
