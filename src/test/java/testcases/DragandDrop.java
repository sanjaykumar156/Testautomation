package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().deleteAllCookies();
		Actions act= new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']\r\n"));
		WebElement destination= driver.findElement(By.xpath("//div[@id='draggable']\r\n"));
		act.dragAndDrop(source, destination).perform();
		driver.quit();
		
	}

}
