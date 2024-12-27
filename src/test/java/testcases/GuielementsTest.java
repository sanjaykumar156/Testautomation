package testcases;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.time.format.DateTimeFormatter;

import pageobjects.AlertPage;
import pageobjects.DatepickersPage;
import pageobjects.DropdownPage;
import pageobjects.GuiEmementsPage;
import pageobjects.RadiobuttonPage;

public class GuielementsTest extends Basetest {
	
	@Test
	public void guielements() {
		logger.info("enternig of personal details started");
		GuiEmementsPage gu = new GuiEmementsPage(driver);
		logger.info("entered first name");
		gu.name(rb.getString("name"));
		logger.info("entered email");
		gu.email(rb.getString("email"));
		logger.info("entered mobile number");
		gu.phone(rb.getString("phone"));
		logger.info("entered address");
		gu.address(rb.getString("address"));
		logger.info("persnoal details has submitted succefully --------> testcase passed successfully");
}
}
