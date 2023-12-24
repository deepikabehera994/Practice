package webdriver_prog;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Click {
	public static void main (String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		
		List<WebElement> els= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement el: els) {
			el.click();
			Thread.sleep(4000);
	}
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
}
		
}
		
	


