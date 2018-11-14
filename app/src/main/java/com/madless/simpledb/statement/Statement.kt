package com.madless.simpledb.statement

interface Statement<T> {
    fun execute(): T
}