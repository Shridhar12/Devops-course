package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import comApplication.GmailApp.CreateAccount;
import comApplication.GmailApp.CreateContact;

public class Base {
	
	private static final WebDriver driver = null;




	@Test 
	public void Login() throws IOException, InterruptedException
	{
	
		/*Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\SSM\\workspace\\GmailApp\\src\\main\\java\\resources\\datadriven.properties");
		prop.load(fis);
		String browserName=prop.getProperty("url");
		System.out.println(browserName);
		
		if(prop.getProperty("browser").equals("chrome"))
		{*/
			System.setProperty("webdriver.chrome.driver", "C:\\SSM\\AUTOMATION\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			
			 
		//create contact
	CreateContact cc=new CreateContact(driver);
	cc.createcontact().click();
	
	//Create Account
	CreateAccount CA=new CreateAccount(driver);
	CA.Firstname().sendKeys("Virat");
	CA.lastname().sendKeys("Anushka");
	}	
}

