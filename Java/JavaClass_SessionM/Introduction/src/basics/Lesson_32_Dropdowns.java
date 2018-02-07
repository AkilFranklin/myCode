package basics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lesson_32_Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//two types of dropdowns
			// static and dynamic
			// with the static type, all of the options are present within the dropdown
			// with the dynamic type, options can change with input
		
		//DEALING WITH DYNAMIC DROPDOWS
		// mandatory step needed to open Chrome. IE uses a similar line
		System.setProperty("webdriver.chrome.driver", "/Users/ajfranklin/Downloads/chromedriver");
		/**********************************************************/
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		
		// DEALING WITH STATIC DROPDOWNS - when spying the tag name will be select
		// if you want to access any methods in a class, create object for that class
		// and access methods using object.method
		
		Select dropdown = new  Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));		
		dropdown.selectByIndex(4);
		dropdown.selectByVisibleText("3 Adults");
		dropdown.selectByValue("8");


		
	}

}
