package com.intelygenz.jacocosample.features.home

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import com.intelygenz.intellij.runnerdeps.Feat
import com.intelygenz.jacocosample.MainActivity
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.junit.Rule

@Feat(feature = "Home.feature", scenario = "Home")
class Home {
    
    @Rule
    var activityRule = ActivityTestRule(MainActivity::class.java, true, false)
    
    @Given("^a user$")
    fun aUser() {
    }
    
    @When("^the user opens the app$")
    fun theUserOpensTheApp() {
        activityRule.launchActivity(null)
    }
    
    @Then("^the app shows$")
    fun theAppShows() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
    
}
