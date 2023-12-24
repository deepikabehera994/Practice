package webdriver_prog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main (String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.1-win32\\GeckoDriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.flipkart.com/");
		
		//System.out.println(driver.getTitle());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println(now);
		
	}
}
