package webdriver_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Admin_MouseOver {
	public static String un="Admin";
	public static String pw="admin";
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Not Matched"+ driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched"+ driver.getTitle());
		}
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Admin"));
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Data Import/Export"));
		System.out.println("Clicked on Submenu");
		WebElement element1 = driver.findElement(By.linkText("Data Import/Export"));
		action.moveToElement(element1).perform();
		driver.findElement(By.linkText("Export")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout comleted");
		driver.close();
		
		
	}

}
