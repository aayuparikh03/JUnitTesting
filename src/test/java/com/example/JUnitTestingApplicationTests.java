package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JUnitTestingApplicationTests {
	int add(int num1,int num2){
		return num1+num2;
	}
	@org.junit.jupiter.params.ParameterizedTest
	@CsvSource({"1,2,3","4,5,9","10,20,30"})
	void testIsEven(int num1,int num2,int expectedSum){
		assertEquals(expectedSum,add(num1,num2));
	}

}

