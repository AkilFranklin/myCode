package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson_37_Radio_Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath("//input[@value = 'Cheese']")).click();
		//System.out.print(driver.findElement(By.xpath("//input[@value = 'Cheese']")).isSelected());
		
		// How many radio buttons are on the page in a group of radio buttons
		System.out.println("\n" + driver.findElements(By.xpath("//input[@name = 'group1']")).size());
		
		// How to click a radio button by choosing which 'number' it is on the page
		int count = driver.findElements(By.xpath("//input[@name = 'group1']")).size();
		
		for (int i=0; i<count; i++)
		{
			//will go through and click each radio button in the specified group
			//driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).click();
			
			// will go through and obtain the values for each radio button if they weren't given
			//System.out.print("\n" + driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).getAttribute("Value"));
			
			// will just get the specific 
			String text = driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).getAttribute("Value");
			if (text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).click();
			}
		}
		
		
		
		
		
	}

}
