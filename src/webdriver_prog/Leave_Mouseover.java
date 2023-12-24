package webdriver_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Leave_Mouseover {
	public static String un="Admin";
	public static String pw="admin";
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//Mouse over on Leave menu
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("Leave"));
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Leave Summary"));
		
		driver.findElement(By.linkText("Employee Leave Summary"));
		Thread.sleep(3000);
		System.out.println("Clicked on employee leave summary");
		//Dropdown
		Select dr1 = new Select(driver.findElement(By.name("cmbId")));
		dr1.selectByVisibleText("select");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[value='...']")).click();
		System.out.println("Clicked");
		driver.findElement(By.linkText("Deepika Behera")).click();
		System.out.println("Clicked on Deepika Behera");
		Select dr2 = new Select(driver.findElement(By.name("leaveTypeId")));
		dr2.selectByVisibleText("Medical");
		System.out.println("Clicked on Medical");
		driver.findElement(By.id("btnView")).click();
		System.out.println("Clicked on View Button");
		
		driver.findElement(By.linkText("Define Days Off"));
		System.out.println("Clicked on subbenu");
		WebElement element1=driver.findElement(By.linkText("Define Days Off"));
		action.moveToElement(element1).perform();
		driver.findElement(By.linkText("Days Off")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		
	}
	

}
