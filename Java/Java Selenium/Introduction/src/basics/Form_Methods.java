package basics;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form_Methods {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		
		// verify that elements are hidden
		// lets say you click a radio button that ends up disappearing other content
		// "isDisplayed" will only work if the element searched for actually exists on the page/in the code
		// cant just check for shit that doesnt exist
		
		System.out.print("\nBefore clicking on Multi City radio button");
		
		//use to stop the test if the following statement is false
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		
		System.out.print("\n"+driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		
		System.out.print("\nAfter clicking on Multi City radio button");
		System.out.print("\n"+driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		
		//this is seeing if the thing above is displayed and will stop the script if
		//the script returns false since it is checking for true
		//use assertFalse to continute the test
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		
		// to verify that an element does not exist on the page at all
		int count = driver.findElements(By.xpath(".//*[@id='fake_city_button']/span")).size();
		if (count==0)
		{
			System.out.print("\nShit aint on the page");
		}
		
		// to verify that an object is enabled or disabled
		// doesnt work for this page since that box is always enabled, but code will work
		driver.findElement(By.xpath(".//*[@id='one_way_button1']/span")).click();
		System.out.print("\n"+driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isEnabled());
		
		
		//get text
		System.out.print("\n"+driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div/h3")).getText());
	}

}
