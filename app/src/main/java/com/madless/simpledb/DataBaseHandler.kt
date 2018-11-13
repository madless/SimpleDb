package com.madless.simpledb

import android.database.sqlite.SQLiteDatabase
import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import com.madless.simpledb.statement.CreateStatement
import com.madless.simpledb.statement.InsertStatement
import com.madless.simpledb.statement.SelectStatement
import java.util.*


object DataBaseHandler {

    // All Static variables
    // Database Version
    private val DATABASE_VERSION = 1

    // Database Name
    private val DATABASE_NAME = "SimpleDb"


    private lateinit var helper: SQLiteOpenHelper
    private val db get() = helper.writableDatabase

    fun init(context: Context) {
        helper = object : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
            // Creating Tables
            override fun onCreate(db: SQLiteDatabase) {

            }

            // Upgrading database
            override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
                // Drop older tables if existed
                dropAllTables()
            }
        }
    }

    fun createTable(statement: CreateStatement) { // CREATE TABLE t(x INTEGER, y, z);
        val request = "CREATE TABLE ${statement.tableName} (${statement.getAllColumns()});"
        Log.d("madtag", "createTable request $request")
        db.execSQL(request)
    }

    fun insert(statement: InsertStatement) {
        val request = "INSERT INTO ${statement.tableName} VALUES (${statement.getAllValues()});"
        Log.d("madtag", "insert request $request")
        db.execSQL(request)
    }

    fun select(statement: SelectStatement): ArrayList<Map<String, String>> {
        var request = "SELECT ${statement.getAllColumns()} FROM ${statement.tableName}"
        if (statement.filters.isNotEmpty()) {
            request += " WHERE ${statement.filters}"
        }
        request += ";"
        Log.d("madtag", "select request $request")
        val cursor = db.rawQuery(request, null)
        val result = ArrayList<Map<String, String>>()
        while (cursor.moveToNext()) {
            val map = TreeMap<String, String>()
            for (columnName in cursor.columnNames) {
                val index = cursor.getColumnIndex(columnName)
                val value = cursor.getString(index)
                map[columnName] = value
            }
            result.add(map)
        }
        Log.d("madtag", "select result $result")
        cursor.close()
        return result
    }

    fun getAllTables(): List<String> {
        val request = "SELECT name FROM sqlite_master WHERE type='table';"
        val cursor = db.rawQuery(request, null)
        val tables = ArrayList<String>()
        while (cursor.moveToNext()) {
            tables.add(cursor.getString(0))
        }
        cursor.close()
        return tables
    }

    fun dropAllTables() {
        val tables = getAllTables()
        for (table in tables) {
            val dropQuery = "DROP TABLE IF EXISTS $table"
            db.execSQL(dropQuery)
        }
    }


}