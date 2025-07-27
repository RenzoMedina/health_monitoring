package com.ejemplo;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("regression")
@SelectClasses(UserTest.class)
public class RegressionSuite {
    
}
