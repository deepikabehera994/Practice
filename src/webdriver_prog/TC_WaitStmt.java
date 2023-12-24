package webdriver_prog;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_WaitStmt {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//Explicit Wait
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		WebDriverWait wait = new WebDriverWait(driver,5000);
        wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
        driver.findElement(By.name("Submit")).click();;
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Login Completed");
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("Logout Completed");
        driver.close();
        
        
        
	}

}
