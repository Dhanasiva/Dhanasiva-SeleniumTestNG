package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractLinks {

	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are "+alltags.size());
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("Tags "+alltags.get(i).getAttribute("href"));
			System.out.println("Tag name "+alltags.get(i).getText());
		}
		
		driver.close();
		
		

	}

}
