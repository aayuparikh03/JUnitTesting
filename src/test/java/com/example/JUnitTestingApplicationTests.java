package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

class Calculator{
	public int divide(int a,int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Can't divide by zero");
		}
		return a/b;
	}


}

@SpringBootTest
class JUnitTestingApplicationTests {



	@Test
	void contextLoads() {
		Calculator calculator=new Calculator();
		
		assertThrows(ArithmeticException.class,(()->calculator.divide(3,0)),"Exception is not occured");

	}

}

