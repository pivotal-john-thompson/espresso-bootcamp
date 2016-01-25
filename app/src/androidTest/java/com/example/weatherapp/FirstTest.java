package com.example.weatherapp;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.weatherapp.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.Espresso.openContextualActionModeOverflowMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagKey;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by pivotal on 2016-01-21.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class FirstTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void task0() {
        SystemClock.sleep(1000);
    }

    @Test
    public void task1()
    {
        openContextualActionModeOverflowMenu();
        onView(allOf(withId(R.id.title), withText("Settings"))).perform(click());
        onView(allOf(withId(android.R.id.title), withText("Forecast Preference"))).check(matches(withText("Forecast Preference")));
        SystemClock.sleep(1000);
    }
}