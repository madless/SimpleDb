package com.madless.simpledb.statement

import com.madless.simpledb.DataBaseHandler
import com.madless.simpledb.model.Column

class CreateStatement(val tableName: String, val columns: List<Column>) : Statement<Unit> {

    override fun execute() {
        DataBaseHandler.createTable(this)
    }

    fun getAllColumns(): String {
        var allColumnsLine = ""
        for ((i, column) in columns.withIndex()) {
            allColumnsLine += column.title + " " + column.type
            if (i != columns.size - 1) {
                allColumnsLine += ", "
            }
        }
        return allColumnsLine
    }

}