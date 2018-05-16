package com.intelygenz.jacocosample.support

import android.app.ActivityManager
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.intent.Intents
import cucumber.api.java.After
import cucumber.api.java.Before
import java.io.IOException

internal class TestProvider {
    

    @Before
    @Throws(IOException::class)
    fun setUp() {
        Intents.init()
    }
    
    @After
    @Throws(IOException::class)
    fun tearDown() {
        Intents.release()
        finishOpenActivities()
    }
    
    private fun finishOpenActivities() {
        Handler(Looper.getMainLooper()).postAtFrontOfQueue {
            val instrumentation = InstrumentationRegistry.getInstrumentation()
            val context = instrumentation.targetContext
            val activityManager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            val appTasks = activityManager.appTasks
            for (appTask in appTasks) {
                appTask.finishAndRemoveTask()
            }
        }
    }
    
}