package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import base.TestBase;

import pages.LoginPage;

public class LoginPageTestCases extends TestBase

{
public LoginPageTestCases() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


LoginPage login;
@BeforeMethod
public void setup() throws IOException
{
	initialozation();
	login=new LoginPage();
}

@Test(groups = "sanity")
public void verifyTitleTestCase()
{
	String exp="Facebook – log in or sign up";
	String act=login.verifyTitle();
	Assert.assertEquals(exp,act );
	Reporter.log("title is "+ act);
}

@Test
public void verifyLogoTestCase()
{
boolean value = login.verifyLogo();	
Assert.assertEquals(value,true);
Reporter.log("logo is "+value);
}

@Test
public void verifyHeadingTestCase()
{
	String exp="Facebook helps you connect and share with the people in your life.";
	String act=login.verifyHeading();
	Assert.assertEquals(exp,act);
	Reporter.log("heading is "  + act);
}

@Test
public void loginTestCase() throws InterruptedException
{
	login.login();
	Thread.sleep(2000);
}


@AfterMethod
public void exit() throws InterruptedException
{
	//Thread.sleep(5000);
	driver.close();
}

}
