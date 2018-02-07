package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lesson 50
		// test the popups like in Amazon when hovering over the Your Account
		// 
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		
		//doing this will allow 'abc' to use the driver AND the actions methods
		Actions abc = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(element).build().perform();
		
		
		
		
		
		
	}

}
