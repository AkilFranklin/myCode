package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UI_Tags_or_Something {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/ajfranklin/Downloads/chromedriver"); // mandatory step needed to open Chrome. IE uses a similar line
		WebDriver driver = new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize(); // maximizes a window
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(".//*[@id=))")));
		
		Thread.sleep(1000L);
		
		a.moveToElement(driver.findElement(By.cssSelector("a[href*='goldloan']"))).build().perform();
		Thread.sleep(1500L);
		driver.findElement(By.cssSelector("a[href*='goldloan']")).sendKeys(Keys.ENTER);
		
		
		
		
		//my code
		//a.moveToElement(driver.findElement(By.linkText("Apply Now")));
		//a.moveToElement(driver.findElement(By.linkText("Gold Loan")));
		
		
		
		
		// if you see a li tag in front when inspecting, you have to use this code
		// if li tag go with css selector
		
		
	}

}
