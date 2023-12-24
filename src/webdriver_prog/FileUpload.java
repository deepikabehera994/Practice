package webdriver_prog;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Behera");
        driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Deepika");
        //To Upload A File
        WebElement fileInput = driver.findElement(By.xpath("//input[@id='photofile'][@type='file']"));
        fileInput.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
        Thread.sleep(7000);
		System.out.println("File Successfully Uploaded");
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(9000);
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
