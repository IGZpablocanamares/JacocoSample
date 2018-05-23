package com.intelygenz.jacocosample.core

import org.junit.Test

class CoreTest {
    
    @Test
    fun doCoreStuff() {
        val core = Core()
        core.doCoreStuff()
    }
    
    @Test
    fun doAnotherCoreStuff() {
        val core = Core()
        core.doAnotherStuff()
    }
    
    @Test
    fun doDomainCoreStuff() {
        val core = Core()
        core.doDomainStuff()
    }
    
    @Test
    fun doAnotherCoolStuff() {
        val coreTestSupport = CoreTestSupport()
        coreTestSupport.doCoreTestSupport()
        val core = Core()
        core.doDomainStuff()
    }
    
    
}