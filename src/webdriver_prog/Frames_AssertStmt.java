package webdriver_prog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;

public class Frames_AssertStmt {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		//verify text box
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
		System.out.println("Text Matched");
		//enter to Frame
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(4000);
		String empid= driver.findElement(By.xpath("//input[@name='txtEmployeeId']")).getAttribute("value");
		System.out.println(empid);
		driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("Behera");
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Deepika");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(4000);
		System.out.println("New Emp Added");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
		System.out.println("Logout Completed");
		driver.close();
		
	}

}
