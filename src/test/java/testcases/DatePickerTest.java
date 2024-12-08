package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.DatepickersPage;

public class DatePickerTest extends Basetest {
	@Test
	public void datepickerhanling() {
		//datepickermodel
				DatepickersPage date= new DatepickersPage(driver);
				date.datebutton();
				String desiredmonth = "February";
				String desiredyear = "2022";
				String desireddate = "4";
				
				while(true) {
					String displayedmonth= date.textmonth();
					String diaplayeyear= date.textyear();
					if(displayedmonth.equals(desiredmonth) && diaplayeyear.equals(desiredyear)){
						break;
					}
					date.previousbutton();
					
				}
				List<WebElement> selectdate= date.selectdate();
				for(int i=0;i<=selectdate.size();i++) {
					if(selectdate.get(i).getText().equals(desireddate)) {
						selectdate.get(i).click();
					}
				}
			
				//datepickers2ndmode2
				date.datebutton2();
				Select monthdropdown = new Select(date.monthselect());
				monthdropdown.selectByVisibleText("Feb");;
				Select yeardropdown = new Select(date.yearselect());
				yeardropdown.selectByVisibleText(desiredyear);
				List<WebElement> selectdate2= date.dateselect();
				for(int i=0;i<=selectdate2.size();i++) {
					if(selectdate2.get(i).getText().equals(desireddate)) {
						selectdate2.get(i).click();
				        break; 
				    }
				}
				
				//datepickers modle3
				date.textstartdate();
				date.textenddate();
				date.submitbtn();
	}

}
