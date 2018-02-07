package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scratch_paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.toolsqa.com/iframe-practice-page/");

		//YOU CAN USE ANY ONE OF THE BELOW STRATEGIES to locate/interact with the first frame of this page.

		//driver.switchTo().frame(0); --> LOCATE frame by index.

		//driver.switchTo().frame("iframe1"); --> LOCATE frame by name attribute.

		//driver.switchTo().frame("IF1"); --> LOCATE frame by id attribute.

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='iframe1']"))); //--> LOCATE frame by WebElement

		driver.findElement(By.name("firstname")).sendKeys("QAClick");

		driver.findElement(By.name("lastname")).sendKeys("Academy");

		//After working with the frame, main important is to come back to the web page.

		//If we don't switch back to the default page, driver will throw an exception.

		driver.switchTo().defaultContent();

		//YOU CAN USE THE BELOW STRATEGIES to locate/interact the second frame of this page.

		driver.switchTo().frame("iframe2"); //--> LOCATE frame by name attribute.

		System.out.println(driver.findElement(By.xpath("//*[@class='entry-title']")).getText());

		}
}
