package webdriver_prog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/dell/Downloads/Webdriver_Application/dropdownNavigate.html");
		Thread.sleep(3000);
		Select st = new Select(driver.findElement(By.name("OptWeb")));
		st.selectByVisibleText("Google");
		Thread.sleep(3000);
		driver.findElement(By.name("btnGo")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/dell/Downloads/Webdriver_Application/multiselectdropdown.html");
		Select st1 = new Select(driver.findElement(By.id("tools")));
		st1.selectByVisibleText("Selenium IDE");
		Thread.sleep(3000);
		System.out.println("Selected Value Is IDE");
		st1.selectByIndex(2);
		Thread.sleep(3000);
		System.out.println("Selected Value Is WebDriver");
		st1.selectByIndex(3);
		Thread.sleep(3000);
		System.out.println("Selected Value Is Grid");
		Thread.sleep(3000);
		driver.close();
		
	}

}
