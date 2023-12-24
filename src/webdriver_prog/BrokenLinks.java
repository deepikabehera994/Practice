package webdriver_prog;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");

		List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("a"));
		
		for(int i=0; i<links.size();i++) {
			
			WebElement element = links.get(i);
			String url = element.getAttribute("herf");
			verifyLink(url);
		}
		String urlLink = null;
		URL link = new URL(urlLink);
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		
		if(httpConn.getResponseCode()!=200) {
			System.out.println("Broken Link");
		}
	}


	private static void verifyLink(String url) {
		// TODO Auto-generated method stub
		
	}
}
