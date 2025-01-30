package com.example;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JUnitTestingApplicationTests {



	@Test
	void contextLoads() {
		Person expected=new Person("Aayu",21);
		Person actual=new Person("Aayu",25);
		assertEquals(expected,actual,"No objects are equals");

	}

}
class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null || getClass()!=obj.getClass()) return false;
		Person p=(Person) obj;
		return age==p.age && name.equals(p.name);
	}
}
