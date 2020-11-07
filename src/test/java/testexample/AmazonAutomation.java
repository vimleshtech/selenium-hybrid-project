package testexample;

import org.testng.annotations.Test;

import pages.AmazonHome;
import utilities.AmazonKeyReader;

import org.testng.annotations.DataProvider;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AmazonAutomation {
	
	
	WebDriver driver =null;
	Properties propData =null;
	
  @Test
  public void login() {
	  
	  AmazonHome home =new AmazonHome(driver);
	  home.loginLink();
	  home.setEmail(propData.getProperty("email"));
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimlesh.Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  propData =AmazonKeyReader.readData();	  
	  
	  driver.get(propData.getProperty("URL"));	  
  }

}
