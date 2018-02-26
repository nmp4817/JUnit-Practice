package com.junitPractice.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.junitPractice.helper.QuickBeforeAfterTest;
import com.junitPractice.helper.StringHelperParameterizedTest;
import com.junitPractice.helper.StringHelperTest;

@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperParameterizedTest.class, StringHelperTest.class })
public class AllTests {

}
