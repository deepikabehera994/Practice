package webdriver_prog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import org.openqa.selenium.By;

public class WindowHand {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/dell/Downloads/Webdriver_Application/multiplewindows.html");
		Thread.sleep(3000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn3")).click();
		ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(wind.get(0));
		Thread.sleep(3000);
		driver.quit();
		
	}

}
