package webdriver_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class JavaScriptExecutor {
	
	public static void main (String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		//String element = driver.findElement(By.id("nav-logo-sprites")).getCssValue("font-size");
		 //System.out.println(element);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript ("document.getElementByClass('loginText').value='Selenium'");
	      WebElement l = driver.findElement(By.id("loginText"));
	      String s = l.getAttribute("value");
	      System.out.println("Value entered is: " + s);
	      driver.quit();
//	      js.executeScript("window.scrollBy(0,1000)", "");

//		try {
//			
//	      File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      File destFile = new File(System.getProperty(("user.dir")+"/test-output/screenshots/ss1.png"));
//	      FileUtils.copyFile(srcFile, destFile);
//	      
//	      
//	      System.out.println("Captured Screenshot :" + destFile.getAbsolutePath());
//		}
//		catch(IOException e) {
//			e.printStackTrace();
	//	}
		 driver.quit();
	}
	
	

	private void executeScript(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
		
	
		
	}

