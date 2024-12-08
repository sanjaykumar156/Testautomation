package testcases;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Basetest {
	public WebDriver driver;
	ResourceBundle rb = ResourceBundle.getBundle("reuse");
	@BeforeSuite
	public void setup() {
		if(rb.getString("browser").equals("edge")) {
			EdgeOptions eoptions= new EdgeOptions();
			eoptions.addArguments("--remote-allow-origins=*");
			driver= new EdgeDriver();
				
	}else {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
	}
		driver.manage().window().maximize();
		driver.get(rb.getString("url"));
}
	@AfterSuite
	public void tearout() {
		//driver.quit();
		
	}
	}
