package com.example;

import com.example.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
//

class JUnitTestingApplicationTests {
	private CalculatorService calculatorService;
	@BeforeEach
	void setUp()
	{
		calculatorService=new CalculatorService();
	}
	@Test
	void addTest()
	{
		int result= calculatorService.add(2,3);
//		assertEquals(4,result,"2+3 should be equals to 5");
		assertEquals(5,result,"2+3 should be equals to 5");
	}
	@Test
	void subTest()
	{
		int result= calculatorService.sub(4,1);
//		assertEquals(3,result,"Result should be 3");
		assertNotEquals(4,result,"It was not expected");

	}

	@Test
	void mulTest()
	{
		int result= calculatorService.mul(3,4);
		assertEquals(12,result,"Multiplication should be 12");
	}
	@Test
	void divTest()
	{
		int result= calculatorService.div(8,2);
		assertEquals(4,result,"Division should be 4");
	}
	@Test
	void checkPositive()
	{
		boolean result=calculatorService.checkPositive(1);
		assertTrue(result,"It is not postive");
	}
}
