package comApplication.GmailApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateContact {
	WebDriver driver;
	public CreateContact(WebDriver driver)
	{
		this.driver=driver;
	}
	By CreateContact=By.xpath("/html/body/div[3]/div[1]/div/ul[1]/li/div/div/div[1]/div/div[3]/a[1]");
	
	
	public WebElement createcontact(){
		return driver.findElement(CreateContact);
		}

}
