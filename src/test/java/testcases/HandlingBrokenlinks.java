package testcases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingBrokenlinks {

	public static void main(String[] args) {
		int countbrokenlinks = 0;
		int countnormallinks = 0;
		int novaluecontains = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> link= driver.findElements(By.tagName("a"));
		
		System.out.println("total no of links are "+" "+link.size());
		for(WebElement tlinks: link) {
			String hrefvalue = tlinks.getDomAttribute("href");
			if(hrefvalue== null|| hrefvalue.isEmpty()|| !hrefvalue.startsWith("http")) {
				novaluecontains++;
				System.out.println("the href is not contain any value");
				continue;
			}
			try {
			URL linkurl = new URL(hrefvalue);
			HttpURLConnection connection= (HttpURLConnection)linkurl.openConnection();
			connection.connect();
			if(connection.getResponseCode()>=400) {
				countbrokenlinks++;
				System.out.println("broken links" +" "+hrefvalue);
			}else {
				System.out.println("normal links"+ " "+hrefvalue );
				countnormallinks++;
			}
		}catch(Exception e) {
		}
		}
		System.err.println("the count of brokenlinks are"+" "+countbrokenlinks);
		System.out.println("the count of normallinks are"+" "+countnormallinks );
		System.out.println("count of href doesnt contains any value"+" "+novaluecontains);

	}

}
