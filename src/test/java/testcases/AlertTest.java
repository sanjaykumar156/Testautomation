package testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageobjects.AlertPage;

public class AlertTest extends Basetest {
	@Test
	public void alertshandling() {
		//alerts
				AlertPage alert = new AlertPage(driver);
				alert.alertbutton();
				Alert al= driver.switchTo().alert();
				al.accept();
				
				alert.conformbutton();
				al= driver.switchTo().alert();
				al.dismiss();
				
				alert.promptbutton();
				al= driver.switchTo().alert();
				al.sendKeys("sanjay");
				al.accept();
	}

}
