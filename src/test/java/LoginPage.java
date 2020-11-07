package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver; //this.driver
	By userName=By.name("email");
	By  password = By.name("pass");
	By  loginButton = By.name("login");
	By forgorAccount =By.linkText("Forgotten account?");
	By createAccount =null;
	
	//Create Constructor (constructor is function which name should be same as name of the class)
	public LoginPage(WebDriver driver) {
			this.driver = driver;
	}
	
	//create function for action 
	public void setUserName(String user) {
		driver.findElement(userName).sendKeys(user);		
	}
	
	//create function for action 
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);		
	}
	
	//create function for action / login 
	public void clickLogin() {
		driver.findElement(loginButton).click();		
	}
		

}
