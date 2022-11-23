package ui;

import org.testng.annotations.*;

public class BeforeAfterTest {

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

	@Test
	public void myTestMethod1() {
		System.out.println("myTestMethod1");
	}

	@Test
	public void myTestMethod2() {
		System.out.println("myTestMethod2");
	}
}