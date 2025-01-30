package com.example.suits;
import com.example.controller.UserControllerTest;
import com.example.controller.OrderControllerTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({UserControllerTest.class, OrderControllerTest.class})
public class ControllerTestSuite {
}
