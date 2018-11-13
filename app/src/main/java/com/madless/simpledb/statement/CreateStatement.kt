package com.madless.simpledb.statement

import com.madless.simpledb.model.Column

class CreateStatement(val tableName: String, val columns: List<Column>) : Statement {

    override fun execute() {

    }

    fun getAllColumns(): String {
        var allColumnsLine = ""
        for ((i, column) in columns.withIndex()) {
            var params = ""
            for ((j, param) in column.params.withIndex()) {
                params += param
                if (j != column.params.size - 1) {
                    params += ", "
                }
            }
            allColumnsLine += column.title + " " + column.type + " " + params
            if (i != columns.size - 1) {
                allColumnsLine += ", "
            }
        }
        return allColumnsLine
    }

}