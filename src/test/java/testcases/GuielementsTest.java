package testcases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		GuiEmementsPage gu = new GuiEmementsPage(driver);
		gu.name(rb.getString("name"));
		gu.email(rb.getString("email"));
		gu.phone(rb.getString("phone"));
		gu.address(rb.getString("address"));
}
}
