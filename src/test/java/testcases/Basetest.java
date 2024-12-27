package testcases;

import java.util.ResourceBundle;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Basetest {
	public WebDriver driver;
	public Logger logger;
	ResourceBundle rb = ResourceBundle.getBundle("reuse");
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		logger=LogManager.getLogger(this.getClass());
		switch(br) {
		case "edge" : driver= new EdgeDriver();
		break;
		case "chrome" : driver = new ChromeDriver();
		break;
		default: System.out.println("invalid browser");
		return;
		}
		driver.manage().window().maximize();
		driver.get(rb.getString("url"));
}
	@AfterClass
	public void tearout() {
		driver.quit();
		
	}
	}
