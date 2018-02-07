package TestingFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	//tests will execute in alphabetical order by default
	
	@BeforeTest		
	public void blah()
	{
		//this is used as a preconditions area
		// i.e. log into a website and go to page 4
		// then every other test will follow after these 
		// steps are completed
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
	
	@Test(enabled=true) 		//self explanatory A
	public void OpenBrowser()
	{
	//To open the browser
	System.out.println("Test 1");
	}
	
	@Test(enabled=true)			//self explanatory B
	public void DoSomething()
	{
		System.out.println("Test 2");
		
	}
	
	
	
}
