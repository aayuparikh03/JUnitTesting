package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest{
	void sampleMethod() throws InterruptedException
	{
		Thread.sleep(300);
	}



}

@SpringBootTest
class JUnitTestingApplicationTests {



	@Test
	void contextLoads() {
		PerformanceTest performanceTest=new PerformanceTest();
		assertTimeout(Duration.ofMillis(500),()->performanceTest.sampleMethod(),"Method takes too long");
	}

}

