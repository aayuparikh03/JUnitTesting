package com.example.suits;

import com.example.service.UserServiceTest;
import com.example.service.OrderServiceTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({UserServiceTest.class, OrderServiceTest.class})
public class ServiceTestSuite {
}
