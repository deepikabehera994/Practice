package webdriver_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class PIM_MouseOver {
	public static String username="Admin";
	public static String password="admin";
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		// Mouse Over On PIM Main Menu
		Actions action= new Actions(driver);
		WebElement element= driver.findElement(By.linkText("PIM"));
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		// Clicking Add Employee SubMenu Link
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked On SubMenu");
		Thread.sleep(3500);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();
		
	}

}
