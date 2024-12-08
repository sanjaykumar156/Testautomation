package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

	public AlertPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="alertBtn")
	WebElement alertbtn;
	
	@FindBy(id="confirmBtn")
	WebElement conformbtn;
	
	@FindBy(id="promptBtn")
	WebElement promptbtn;
	
	public void alertbutton() {
		alertbtn.click();	
	}
	public void conformbutton() {
		conformbtn.click();
	}
	public void promptbutton() {
		promptbtn.click();
	}
}
