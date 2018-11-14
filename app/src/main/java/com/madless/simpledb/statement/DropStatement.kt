package com.madless.simpledb.statement

import com.madless.simpledb.DataBaseHandler

class DropStatement(val tableName: String, val param: String) : Statement<Unit> {
    override fun execute() {
        DataBaseHandler.drop(this)
    }
}