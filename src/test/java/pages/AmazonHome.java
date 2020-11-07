package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.AmazonKeyReader;

public class AmazonHome {

	WebDriver driver=null;
	Properties propKey =null;
	
	By LoginLink = null;
	By EmailTextbox = null;
	By ContinueButton = null;
	By PasswrodTextbox =null;
	By SignInButton =null;
	By UserIcon =null;

			
	public AmazonHome(WebDriver driver) {
		
		this.driver =driver;
		propKey = AmazonKeyReader.readKeys();
		
		LoginLink = By.xpath(propKey.getProperty("LoginLink"));
		EmailTextbox = By.xpath(propKey.getProperty("EmailTextbox"));
		ContinueButton = By.xpath(propKey.getProperty("ContinueButton"));
		
	}
	
	public void loginLink() {
		driver.findElement(LoginLink).click();
	}

	public void setEmail(String text) {
		driver.findElement(EmailTextbox).sendKeys(text);
	}
	
	public void continueLink() {
		driver.findElement(ContinueButton).click();
	}
	
	
}
