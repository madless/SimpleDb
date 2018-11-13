package com.madless.simpledb.statement

class InsertStatement(val tableName: String, val values: List<String>): Statement {
    override fun execute() {

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