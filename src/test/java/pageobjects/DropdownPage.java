package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage {

	public DropdownPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="country")
	WebElement selectcountries;
	
	@FindBy(id="comboBox")
	WebElement dropdownbtn;
	
	@FindBy(xpath="//div[@id='dropdown']//div[@class='option']")
	List<WebElement> drpiteamselect;
	
	public WebElement countrydrp() {
		return selectcountries;
	}
	public void dropdownbutton() {
		dropdownbtn.click();
	}
	public List<WebElement> iteamsselect(){
		return drpiteamselect;
	}
	
	

}
