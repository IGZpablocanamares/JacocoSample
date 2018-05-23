package com.intelygenz.jacocosample.core

import com.intelygenz.jacocosample.core.domain.Author
import java.util.*

class Core {
    
    fun doCoreStuff() {
        println("doCoreStuff")
    }
    
    fun doAnotherStuff() {
        println("doAnotherStuff")
    }
    
    fun dontDoNothingWithoutTest() {
        println("dontDoNothingWithoutTest")
    }
    
    fun doDomainStuff() {
        println("doDomainStuff")
        val author = Author(0, "name", "surname", Date())
        val id = author.id
        val author2 = Author(1, "name", "surname", Date())
        println(author == author2)
    }
    
}