package testexample;

import org.testng.annotations.Test;

import utilities.ExcelReader;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Facebook {

	WebDriver driver =null;
	Properties prop =null;
	
	@Test(dataProvider = "dp")
  public void f(String tid,String username,String password) {
		//System.out.println(tid+"\t"+username+"\t"+password);
		
		driver.findElement(By.name(prop.getProperty("aa"))).sendKeys(username);
		driver.findElement(By.name(prop.getProperty("loginpass"))).sendKeys(password);
		driver.findElement(By.name(prop.getProperty("loginbtn"))).click();
		
		
  }

  @DataProvider
  public Object[][] dp() {    
	
	   Object obj[][] =ExcelReader.getData();;
	
	   return obj;
  }
  
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimlesh.Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://facebook.com");
	
	  try {
		  
		  FileInputStream fs =new FileInputStream("C:\\Users\\Vimlesh.Kumar\\eclipse-workspace\\SeleniumExample\\src\\test\\java\\keyfiles\\webelements.properties");
		  prop =new Properties();
		  prop.load(fs);
	  }catch (Exception e) {
		// TODO: handle exception
	}
  }
}
