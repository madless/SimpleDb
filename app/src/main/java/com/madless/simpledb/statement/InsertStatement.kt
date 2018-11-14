package com.madless.simpledb.statement

import com.madless.simpledb.DataBaseHandler

class InsertStatement(val tableName: String, val values: List<String>): Statement<Unit> {
    override fun execute() {
        DataBaseHandler.insert(this)
    }

    fun getAllValues() : String {
        var allValues = ""
        for ((i, value) in values.withIndex()) {
            allValues += "\"$value\""
            if (i != values.size - 1) {
                allValues += ", "
            }
        }
        return allValues
    }

}