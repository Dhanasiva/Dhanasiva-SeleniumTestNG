package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {

	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.print("url is " + url);
	
		
		
		driver.close();
		
		

	}

}
