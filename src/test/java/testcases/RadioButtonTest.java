package testcases;

import org.testng.annotations.Test;

import pageobjects.RadiobuttonPage;

public class RadioButtonTest extends Basetest{
	@Test
	public void alerthandle() {
		RadiobuttonPage radio = new RadiobuttonPage(driver);
		radio.button();
		radio.checkbox();
	}

}
