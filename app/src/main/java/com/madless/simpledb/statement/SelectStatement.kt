package com.madless.simpledb.statement

import com.madless.simpledb.DataBaseHandler

data class SelectStatement(val tableName: String,
                      val columns: List<String> = ArrayList(),
                      val filters: String = ""): Statement<ArrayList<Map<String, String>>> {
    override fun execute(): ArrayList<Map<String, String>> {
        return DataBaseHandler.select(this)
    }

    fun getAllColumns() : String {
        if (!columns.isEmpty()) {
            var allColumns = ""
            for ((i, value) in columns.withIndex()) {
                allColumns += value
                if (i != columns.size - 1) {
                    allColumns += ", "
                }
            }
            return allColumns
        } else {
            return "*"
        }
    }

}