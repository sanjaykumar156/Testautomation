package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouseactions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().deleteAllCookies();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		Actions action = new Actions(driver);
		action.moveToElement(button).build().perform();
		driver.findElement(By.xpath("//a[text()='Mobiles']")).getText();
		driver.close();
	}
	

}
