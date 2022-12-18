package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestSuite {
	ChromeDriver driver;
	long startTime;
	
	
	@BeforeSuite
	public void LaunchBrowser() {
		  startTime=System.currentTimeMillis();
	      WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
	      driver.get("https://www.amazon.in/");   
	}
	
	@Test
	public void openBing() {
		 driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void openUsedTamilBooks() {
		 driver.get("https://usedtamilbooks.com/collections");
	}
	
	@AfterSuite
	public void closeBrowser() {
	      driver.quit();
	      long endTime = System.currentTimeMillis();
	      long totalTime=endTime-startTime;
	      System.out.println(totalTime);
	}
	

}
