package webdriver_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/dell/Downloads/Webdriver_Application/WebTable.html");
		// Count
		int row = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		// Data Cell
		String cell = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[5]/td[2]")).getText();
		System.out.println(cell);
		//Data Table
		for(int i=1; i<=row; i++)        {
			String data = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(data);
		}
		driver.close();
	}

}
