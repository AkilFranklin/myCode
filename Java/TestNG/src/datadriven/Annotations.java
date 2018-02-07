package datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
	//tests will execute in alphabetical order by default
	
	@BeforeTest		
	public void blah()
	{
		//this is used as a preconditions area
		// i.e. log into a website and go to page 4
		// then every other test will follow after these 
		// steps are completed`
		// ONLY executes 1 time before the test run starts
		System.out.println("delete cookies before all tests");
	}
	
	@BeforeMethod
	public void PriorTo()
	{
		// these are done before each and every test/method
		// for example - open browser and go to site 
		System.out.println("Test Case Begin");
	}
	
	@AfterTest
	public void WhenDone()
	{
		System.out.println("Deleting cookies after all tests done. cleaning up");
	}
	
	@AfterMethod
	public void AfterTestCase()
	{
		// this is run after each and ever method
		System.out.println("Test Case done");
	}
	

	
	
	
	@DataProvider  // this is the data driven testing example
	public Object[][] GetData()
	{
		// Object[][] data = new Object[i][j];
		// i = number of times test will run
		// j = number of parameters it should send for each execution
		// 	for example, if 2 is there, it could mean 1 userid + 1 password
		
		Object[][] data = new Object[3][2];
		data[0][0] = "UsernameA";
		data[0][1] = "PasswordA";
		
		data[1][0] = "UsernameB";
		data[1][1] = "PasswordB";
		
		data[2][0] = "UsernameC";
		data[2][1] = "PasswordD";
		
		return data;
	}
	
	@Test (dataProvider = "GetData")
	public void UserID(String username, String password)
	{	
		System.out.println("Got some data ");
		System.out.println("Username was" + username + ", and pass was " + password);
	}
	
	
}
