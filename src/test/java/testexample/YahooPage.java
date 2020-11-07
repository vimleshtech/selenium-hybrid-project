package testexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooPage {
	
	WebDriver driver =null;
	String baseURL ="https://www.facebook.com/";
	
	//
	Properties prop =null;
	
	
  @Test
  public void f() {
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  
	  driver.findElement(By.name(prop.getProperty("aa"))).sendKeys("abd@gmail.com");
	  
	  //driver.findElement(By.name("email")).sendKeys("abd@gmail.com");
	    
  }
  
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  
	  //read properties file
	  FileInputStream fs = new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\webelements.properties");
	  prop =new Properties();
	  prop.load(fs);
	  
	  driver = new ChromeDriver();
	  driver.get(baseURL);
	  
  }
}
