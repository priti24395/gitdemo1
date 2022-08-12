package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//img[@alt='Facebook']") private WebElement logo;
	@FindBy(xpath = "//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement heading;
	@FindBy(xpath = "//input[@id='email']") private WebElement emailid;
	@FindBy(xpath = "//input[@id='pass']") private WebElement password;
	@FindBy(xpath = "//button[@name='login']") private WebElement login;

	
	public LoginPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);

	}
	
	
	public String  verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLogo() 
	{
		return logo.isDisplayed();
	}
	
	public String verifyHeading()
	{
		return heading.getText();
	}
	
	public void login() throws InterruptedException
	{
		emailid.sendKeys(prop.getProperty("emailId"));
		Thread.sleep(2000);
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
	}
	
}
