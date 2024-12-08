package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuiEmementsPage extends BasePage {

	public GuiEmementsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="name")
	WebElement txtname;
	@FindBy(id="email")
	WebElement txtemail;
	@FindBy(id="phone")
	WebElement txtphone;
	@FindBy(id="textarea")
	WebElement txtaddress;
	
	public void name(String name) {
		txtname.sendKeys(name);
	}
	public void email(String email) {
		txtemail.sendKeys(email);
	}
	public void phone(String phone) {
		txtphone.sendKeys(phone);
	}
	public void address(String add) {
		txtaddress.sendKeys(add);
	}

}
