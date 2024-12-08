package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.DropdownPage;

public class DropdownTest extends Basetest{
	@Test
	public void dropdownhandle() {
		DropdownPage drp = new DropdownPage(driver);
		Select dropdown = new Select(drp.countrydrp());
		dropdown.selectByVisibleText("India");
		
		//dropdown modle 2
		drp.dropdownbutton();
		List<WebElement> items= drp.iteamsselect();
		for(int i=0;i<items.size();i++) {
			if(items.get(i).getText().equals("Item 40")) {
				items.get(i).click();
				break;
			}
		}
		
	}

}
