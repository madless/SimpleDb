package com.madless.simpledb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val columns = ArrayList<Column>()
        columns.add(Column("id", "INT"))
        columns.add(Column("name", "TEXT"))
        columns.add(Column("age", "INT"))
        val createStatement = CreateStatement("person", columns)

        val insertStatement1 = InsertStatement("person", arrayListOf("1", "John", "17"))
        val insertStatement2 = InsertStatement("person", arrayListOf("2", "Jane", "18"))
        val insertStatement3 = InsertStatement("person", arrayListOf("3", "Tom", "19"))

        val selectStatement1 = SelectStatement("person")

        val selectStatement2 = SelectStatement("person", arrayListOf("id", "name"), "id > 1")

        try {

            Log.d("madtag", "------------------- START PARSING")
            val text = "select id, name from person where id = 1;"
            val stream = text.byteInputStream(StandardCharsets.UTF_8)
            val inputStream = ANTLRInputStream(stream)
            val requestLexer = RequestLexer(inputStream)
            val commonTokenStream = CommonTokenStream(requestLexer)
            val requestParser = RequestParser(commonTokenStream)


            val commandResult = requestParser.parse()
            val generatedSelectStatement = commandResult?.statement as SelectStatement
            Log.d("madtag", "generatedSelectStatement $generatedSelectStatement")
            Log.d("madtag", "------------------- FINISHED PARSING")


            Log.d("madtag", "------------------- STARTED")
            DataBaseHandler.init(this)
            DataBaseHandler.dropAllTables()
            DataBaseHandler.createTable(createStatement)
            Log.d("madtag", "tables ${DataBaseHandler.getAllTables()}")
            DataBaseHandler.insert(insertStatement1)
            DataBaseHandler.insert(insertStatement2)
            DataBaseHandler.insert(insertStatement3)
            DataBaseHandler.select(generatedSelectStatement)
//            DataBaseHandler.select(selectStatement2)
            DataBaseHandler.dropAllTables()
            Log.d("madtag", "tables after drop ${DataBaseHandler.getAllTables()}")
            Log.d("madtag", "------------------- FINISHED")


        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
