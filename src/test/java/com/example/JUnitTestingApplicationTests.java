package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JUnitTestingApplicationTests {


	@Test
	void contextLoads() {
		int[] expected={1,2,3,4};
		int[] actual={1,2,3,4};
		assertTrue(Arrays.equals(expected,actual),"Arrays are not equal!");

	}

}
