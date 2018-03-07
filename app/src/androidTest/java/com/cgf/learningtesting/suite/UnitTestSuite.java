package com.cgf.learningtesting.suite;

import com.cgf.learningtesting.ExampleInstrumentedTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 测试套件，可以让多个单元测试同步进行
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ExampleInstrumentedTest.class})
public class UnitTestSuite {
}
