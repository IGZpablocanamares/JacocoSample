package com.intelygenz.jacocosample.coresupport

import com.intelygenz.jacocosample.coredeps.Dependencies

class AppDependencies : Dependencies {
    
    override fun dependenciesDoStuff() {
        System.out.println("dependenciesDoStuff")
    }
    
}