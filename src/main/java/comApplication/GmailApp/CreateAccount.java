package comApplication.GmailApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {
	WebDriver driver;
	
	
	public CreateAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By firstname=By.xpath("//input[@type='text']");
	By lastname=By.id("lastName");
	
	
	
	
	public WebElement Firstname(){
		return driver.findElement(firstname);
		}
	public WebElement lastname(){
		return driver.findElement(lastname);
		}

}
