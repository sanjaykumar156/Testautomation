package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testcases.Basetest;

public class DatepickersPage extends BasePage {

	public DatepickersPage(WebDriver driver) {
		super(driver);
		
	}
	//locators
	@FindBy(id="datepicker")
	WebElement datepicker;
	@FindBy(xpath="//a[@title='Prev']")
	WebElement btnprevious;
	@FindBy(xpath="//a[@title='Next']")
	WebElement btnnext;
	@FindBy(xpath="//div[@id='ui-datepicker-div']//tbody/tr/td")
	List<WebElement> btndatepicker;
	@FindBy(xpath="//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")
	WebElement txtmonth;
	@FindBy(xpath="//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")
	WebElement txtyear;
	
	public void datebutton() {
		datepicker.click();
	}
	public void previousbutton() {
		btnprevious.click();
	}
	public void nextbutton() {
		btnnext.click();
	}
	public List<WebElement> selectdate() {
		return btndatepicker;
	}
	public String textmonth() {
		String monthyeartext = txtmonth.getText();
		return monthyeartext;
	}
	public String textyear() {
		String monthyeartext = txtyear.getText();
		return monthyeartext;
	}
	
	//model2
	@FindBy(id="txtDate")
	WebElement datepicker2;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement btnmonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement btnyear;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	List<WebElement> selectdate;
	
	public void datebutton2() {
		datepicker2.click();
	}
	public WebElement monthselect() {
		return btnmonth;
	}
	public WebElement yearselect() {
		return btnyear;
	}
	public List<WebElement> dateselect(){
		return selectdate;
	}
	
	//model 3
	@FindBy(id="start-date")
	WebElement txtsatrtdate;
	
	@FindBy(id="end-date")
	WebElement txtenddate;
	
	@FindBy(xpath="//button[@class='submit-btn']")
	WebElement btnsubmit;
	
	public void textstartdate() {
		txtsatrtdate.sendKeys("04-02-2022");
	}
	public void textenddate() {
		txtenddate.sendKeys("04-02-2025");
	}
	public void submitbtn() {
		btnsubmit.click();
	}
	
	
	
	
	
	
	
	
	

}
