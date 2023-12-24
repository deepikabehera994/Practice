package webdriver_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PHP_Travels {
	public static void main(String args[])throws Exception {
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Downloads\\FirefoxDriver\\geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.navigate().to("https://www.phptravels.net/");
       if(driver.getTitle().equals("PHPTRAVELS | Travel Technology Partner")) {
    	   System.out.println("1st Title Matched");
       }
       else {
    	   System.out.println("Title Not Matched" + driver.getTitle());
       }
       Thread.sleep(3000);
      //driver.findElement(By.linkText("Hotels")).click();
      //Select drpHotel = new Select(driver.findElement(By.className("select2-input")));
      //drpHotel.selectByVisibleText("Grand Plaza Serviced Apartments,London");
      //System.out.println("Click On DropDown");
       driver.findElement(By.linkText("Flights")).click();
       WebElement radio1 = driver.findElement(By.className("custom-control-label"));
       radio1.click();
       System.out.println("1st radio button clicked");
       Select class1 = new Select(driver.findElement(By.linkText("Economy")));
       class1.selectByVisibleText("Business");
       System.out.println("Clicked on class");
       
	}

}
