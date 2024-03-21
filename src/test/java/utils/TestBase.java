package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
  public WebDriver WebDriverManager() {
	  
	  if(driver == null) {
		 
	  System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();	  
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  }
	  return driver;
  }
}
