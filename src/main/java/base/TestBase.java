package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws IOException {
		 prop=new Properties();
		FileInputStream input=new FileInputStream("C:\\Users\\icon\\eclipse-workspace\\facebook\\ConfigDetails\\config.properties");
		prop.load(input);
	}
	
	public static void initialozation()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icon\\eclipse-workspace\\facebook\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		driver=new ChromeDriver(option);
		 
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	}

}
