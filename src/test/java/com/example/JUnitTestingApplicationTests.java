package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JUnitTestingApplicationTests {
	boolean isEven(int num){
		return num%2==0;
	}
	@org.junit.jupiter.params.ParameterizedTest
	@ValueSource(ints={2,4,6,8})
	void testIsEven(int num){
		assertTrue(isEven(num),"Number should be even only");
	}

}

