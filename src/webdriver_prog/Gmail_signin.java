package webdriver_prog;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_signin {
	public static void main (String args[])throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("Sign in page viewed");
		
		driver.findElement(By.className("BHzsHc")).click();
		
		//Enter Email id
		driver.findElement(By.id("identifierId")).sendKeys("automationfunworld",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on next button
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		//driver.findElement(By.name("password")).sendKeys("song joong ki@753");
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		//System.out.println("Sign in completed");
		
	}

}
