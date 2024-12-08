package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadiobuttonPage extends BasePage {

	public RadiobuttonPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//label[normalize-space()='Male']")
	WebElement btnclick;
	@FindBy(xpath="//label[normalize-space()='Sunday']")
	WebElement checkbox;
	
	public void button() {
		btnclick.click();
	}
	public void checkbox() {
		checkbox.click();
	}
	

	
	
	

}
