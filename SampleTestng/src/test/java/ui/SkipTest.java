package ui;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	Boolean datasetup = false;
	@Test(enabled=false)
	public void skiptest1()
	{
		System.out.println("Skip this as it is not yet completed");
	}
	@Test
	public void skiptest2()
	{
		System.out.println("skipping forcefully");
		throw new SkipException("Skipped forcefully");
	}
	@Test()
	public void skiptest3() {
		System.out.println("skipping based on condition");
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do Not execute further steps");
			throw new SkipException("Not executed further");
		}

	}
	

}
