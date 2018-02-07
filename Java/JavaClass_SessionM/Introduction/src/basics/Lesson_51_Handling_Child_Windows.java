package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson_51_Handling_Child_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lesson 51, Handling Child Windows
		// Child window is when you click a link and a new tab or window opens up
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.findElement(By.linkText("Learn more")).click();
		System.out.print(driver.getTitle());
		
		Set<String>ids = driver.getWindowHandles(); // parent window should be in first cell
		
		Iterator<String> it = ids.iterator(); 		
		String parent_id = it.next(); 
		String child_id = it.next();
		
		driver.switchTo().window(child_id); 		// all code after this line apply to the child window. 
		System.out.print("\n"+driver.getTitle()); 	// this line applies to child window
		
		driver.switchTo().window(parent_id);		// you have to switch back to control the parent window
		System.out.print("\n"+driver.getTitle());	// this will print the parent (1st) window
		
		//driver.get("https://support.google.com/accounts/answer/1733224?hl=en");
		
	}

}
