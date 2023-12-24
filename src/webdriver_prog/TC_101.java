package webdriver_prog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_101 {
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout"));
		driver.close();
		
		
	}

}
