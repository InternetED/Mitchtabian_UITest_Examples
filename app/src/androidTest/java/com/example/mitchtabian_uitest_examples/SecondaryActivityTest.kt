package com.example.mitchtabian_uitest_examples

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{

    @get: Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView() {

        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_backButton() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.btnBack))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_isTitleTextDisplayed() {

        onView(withId(R.id.activity_secondary_title))
            .check(matches(withText(R.string.text_secondary_activity)))
    }
}