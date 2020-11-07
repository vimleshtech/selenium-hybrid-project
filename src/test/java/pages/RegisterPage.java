package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page Model
public class RegisterPage {

	
	WebDriver driver; //this.driver
	By userName=By.name("name");
	By email=By.name("emailid");
	//
	By  password = By.name("pass");
	By  loginButton = By.name("login");
	
	//Create Constructor (constructor is function which name should be same as name of the class)
	public RegisterPage(WebDriver driver) {
			this.driver = driver;
	}
		
	
}
