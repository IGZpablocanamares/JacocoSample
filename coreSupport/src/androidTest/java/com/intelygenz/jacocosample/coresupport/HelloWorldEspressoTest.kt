package com.intelygenz.jacocosample.coresupport

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class HelloWorldEspressoTest {
    
    @Rule
    @JvmField
    var mActivityRule: ActivityTestRule<HelloWorldActivity> = ActivityTestRule(HelloWorldActivity::class.java)
    
    @Test
    fun helloWorld_displayed() {
        onView(withText("Hello world!")).check(matches(isDisplayed()))
    }
    
    @Test
    fun fabButton_clicked() {
        onView(withId(R.id.fab)).perform(click())
    }
    
}