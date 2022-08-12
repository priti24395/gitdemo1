package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.FacebookPage;
import pages.LoginPage;

public class FacebookPageTestCases extends TestBase
{
 
	LoginPage login;
	FacebookPage face;
	public FacebookPageTestCases() throws IOException {
		super();
	
	}
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialozation();
		login=new LoginPage();
		face=new FacebookPage();
		login.login();
//		Thread.sleep(10000);
	}
	
	@Test
	public void sendMessageTestCase() throws InterruptedException {
		face.sendMessage();
//		Thread.sleep(10000);

	}
	
	

	@AfterMethod
	public void exit() throws InterruptedException
	{
			driver.close();
		
	}
}
