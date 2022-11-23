package ui;

import org.testng.annotations.*;

public class GroupTest {

	@Test(groups="regression")
	public void Test1() {
		System.out.println("Testcase1");
	}

	@Test(groups="regression")
	public void Test2() {
		System.out.println("Tetscase2");
	}
	
	@Test(groups="bvt")
	public void Test3() {
		System.out.println("Tetscase3");
	}
	
	@Test(groups="bvt")
	public void Test4() {
		System.out.println("Tetscase4");
	}
}