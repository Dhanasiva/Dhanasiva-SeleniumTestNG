package ui;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestUsingDataProvider {
	@BeforeClass
	public void logintoApp()
	{
		System.out.println("Login to Applicaion");
	}
	@AfterTest
	public void logouttoApp()
	{
		System.out.println("Logout to Application");
	}
	@Test()
	public void blogouttest() {
		System.out.println("Logout is successful");

	}
	@Test()
	public void alogintest() {
		System.out.println("Login is successful");

	}

}
