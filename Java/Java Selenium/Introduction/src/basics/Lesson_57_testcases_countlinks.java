package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lesson_57_testcases_countlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// taking the count of the links on a page
		// or taking the link count in the header or the footer section
		
		
		WebDriver ff = new FirefoxDriver();
		
		ff.get("http://www.ebay.com");
		// next line is for all of the links
		// if there is a link, it will have the tag "a" which stands for anchor
		System.out.println("Links on the page: ");
		System.out.println(ff.findElements(By.tagName("a")).size());
		
		// how to count the links in just the footer
		WebElement footer = ff.findElement(By.xpath(".//*[@id='footerFragment']"));
		System.out.println("Links in just the footer: ");
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		// for the header
		WebElement header = ff.findElement(By.xpath(".//*[@id='headerFragment']"));
		System.out.println("Links in the header: ");
		System.out.println(header.findElements(By.tagName("a")).size());
		
		//for the rest
		WebElement body = ff.findElement(By.xpath("html/body/div[4]"));
		System.out.println("Links in the rest: ");
		System.out.println(body.findElements(By.tagName("a")).size());
		
		//how to print the link names 
		
		WebElement col = ff.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links in the 2nd column of footer: ");

		for (int i = 0; i<col.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			
			if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		// go to the next link and take the count
		ff.findElement(By.linkText("Site Map")).click();
		WebElement sitemapbody = ff.findElement(By.xpath(".//*[@id='main']/tbody"));
		System.out.println("Links on the site map body: ");
		System.out.println(ff.getTitle());
		System.out.println(sitemapbody.findElements(By.tagName("a")).size());
		ff.close();
	}

}

// this program will break because there is no site map within the body of the 
// site map. it is present in the entire page, but the program cannot click
// what it cannot find in the area told. fix it by not looking in the entire page
// or just dont look for the site map a 2nd time
