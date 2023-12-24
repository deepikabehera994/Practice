package webdriver_prog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_Verify {
	public static String username="Admin";
	public static String password="admin";
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Test Case Steps
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level Of HR Management")) {
			System.out.println("Title Matched");
		}
			else {
				System.out.println("Title Not Matched"+ driver.getTitle());
			}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();
		
	}

}
