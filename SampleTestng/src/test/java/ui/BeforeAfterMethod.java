package ui;

import org.testng.annotations.*;

public class BeforeAfterMethod {

	/*
	 * @BeforeTest public void beforeTest() { System.out.println("BeforeTest"); }
	 * 
	 * @BeforeClass public void beforeClass() { System.out.println("BeforeClass"); }
	 */

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	/*
	 * @AfterClass public void afterClass() { System.out.println("AfterClass"); }
	 * 
	 * @AfterTest public void afterTest() { System.out.println("AfterTest"); }
	 */
	@Test
	public void myTestMethod1() {
		System.out.println("myTestMethod1");
	}

	@Test
	public void myTestMethod2() {
		System.out.println("myTestMethod2");
	}
}