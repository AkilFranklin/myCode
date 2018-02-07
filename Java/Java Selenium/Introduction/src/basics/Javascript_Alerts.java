package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for some reason chrome will not click this button!!!
		//System.setProperty("webdriver.chrome.driver", "/Users/ajfranklin/Downloads/chromedriver"); // mandatory step needed to open Chrome. IE uses a similar line
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		//driver.findElement(By.xpath("//input[@value = 'Confirmation Alert']")).click();
		//driver.switchTo().alert().accept(); // this will choose the 'ok' 'done' 'yes' etc types of boxes
		
		
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		ffdriver.findElement(By.xpath("//input[@value = 'Confirmation Alert']")).click();
		
		
		//to verify the text
		System.out.print(ffdriver.switchTo().alert().getText());
		
		// to click the accept button
		ffdriver.switchTo().alert().accept();
		
		//to click the cancel button
		//ffdriver.switchTo().alert().dismiss();
		
		//to input text
		//ffdriver.switchTo().alert().sendKeys("blah blah");
				
				
	}

}
