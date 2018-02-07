package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson_73_grids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a way to know that an element is a table or not
		// if it is then the table will have "tr" and "td" tags
		// tr for creating rows
		// td for for writing data to a particular row
		//
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.espncricinfo.com//ci/engine/match/415281.html");
		WebElement table=ff.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]"));

		// finding the # of rows in the table
		List<WebElement>numofrows=table.findElements(By.tagName("tr"));
		System.out.println("number of rows is: "+numofrows.size());
		int i=0;
		
		// finding the # of columns in each row
		for(WebElement eachrow:numofrows)
		{
			
			List<WebElement>eachcolumn=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("Number of columns in "+i+"th row are: " + eachcolumn.size());
			
			//finding a cell's values
			for(WebElement text:eachcolumn)
			{
				System.out.println(text.getText());
			}
		}
		
		
	}

}
