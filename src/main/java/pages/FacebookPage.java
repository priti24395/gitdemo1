package pages;

import java.io.IOException;
import java.io.Serial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FacebookPage extends TestBase {

	
	@FindBy(xpath = "//*[@id=\"mount_0_0_jS\"]/div[1]/div[1]/div/div[2]/div[4]/div[1]/div[2]/span/span/div/div[1]") private WebElement messenger;
	@FindBy(xpath = "(//input[@type='search'])[1]")  private WebElement searchbar;
	
	public FacebookPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		
	}
	
	public void sendMessage() 
	{
messenger.click();
//searchbar.click();
searchbar.sendKeys("mayur");
	}
	
}
