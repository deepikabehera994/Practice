package webdriver_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class TC_102 {
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Admin"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Job"));
		System.out.println("Clicked on Submenu");
		WebElement element1 = driver.findElement(By.linkText("Job"));
		action.moveToElement(element1).build().perform();
		driver.findElement(By.linkText("Employment Status")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		
		
	}
	

}
