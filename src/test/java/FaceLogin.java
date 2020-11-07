package testexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class FaceLogin {
	
	WebDriver driver =null;
	LoginPage login=null;
	
			
  @Test
  public void f() {
	  
	  login.setUserName("vimlesh073@gmail.com");
	  login.setPassword("gkjhfjhgff");
	  login.clickLogin();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimlesh.Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	  driver =new ChromeDriver();
	  driver.get("https://wwww.facebook.com/");
	  login = new LoginPage(driver);
	  
  }
}
