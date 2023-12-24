package webdriver_prog;
//import java.util.List;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class TC_103 {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		 
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("BEHERA");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("DEEPIKA");
		
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileInput.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		System.out.println("File Uploaded Sucessfully");
		 
		//driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		//Select st = new Select(driver.findElement(By.xpath("//input[@id='cmbMarital']")));
		//st.selectByVisibleText("Unmarried");
		
		//driver.switchTo().frame("_yuiResizeMonitor");
		//List<WebElement> els = driver.findElement(By.xpath("//input[@type='radio']"));
		//for(WebElement el:els) {
			//el.click();
		//driver.switchTo().defaultContent();
		//}
		//driver.findElement(By.xpath("//input[@id='DOB']")).sendKeys("1996-05-22");
		//driver.findElement(By.xpath("//input[@id='txtLicExpDate']")).sendKeys("2035-07-15");
		//driver.findElement(By.xpath("//input[@id='btnEditPers']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}

}
