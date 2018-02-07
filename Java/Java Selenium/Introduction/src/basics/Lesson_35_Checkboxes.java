package basics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lesson_35_Checkboxes {

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
		

		// CHECKBOXES
		// next line will find the checkbox and check it
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		// next line will check that the box is checked and it will verify and print that it is 
		// currently checked
		System.out.print(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		// uncheck
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.print("\n" + driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

	}

}
