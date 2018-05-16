package com.intelygenz.jacocosample.support.runner

import android.os.Bundle
import android.support.test.runner.AndroidJUnitRunner
import android.util.Log
import com.intelygenz.android.acceptancetestrunner.AcceptanceInstrumentationCore
import com.intelygenz.jacocosample.BuildConfig.TEST_TAGS

private const val TAG = "CucumberTestRunner"
private const val CUCUMBER_TAGS_KEY = "tags"

internal class CucumberTestRunner : AndroidJUnitRunner() {
    
    private val instrumentationCore = AcceptanceInstrumentationCore(this)
    
    override fun onCreate(bundle: Bundle) {
        super.onCreate(bundle)
        if (TEST_TAGS.isNotEmpty()) {
            val tags = TEST_TAGS
                .replace(",".toRegex(), "--")
                .replace("\\s".toRegex(), "")
            bundle.putString(CUCUMBER_TAGS_KEY, tags)
        }
        instrumentationCore.create(bundle)
    }
    
    override fun onStart() {
        Log.d(TAG, "onStart")
        waitForIdleSync()
        instrumentationCore.start()
    }
    
    override fun finish(resultCode: Int, results: Bundle) {
        Log.d(TAG, "finish")
        super.finish(resultCode, results)
    }
    
}