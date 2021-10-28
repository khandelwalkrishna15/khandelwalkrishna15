package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;


public class TestNgAnnotation {
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}
	
	
	
	@Test
	public void Test() {
		System.out.println("Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	
}
