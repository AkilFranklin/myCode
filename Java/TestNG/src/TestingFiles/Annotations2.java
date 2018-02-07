package TestingFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {
	
	@BeforeSuite
	public void InstallSoftware()
	{
		// this will be done above all classes
		// meaning that of all the classes containing all the 
		// test cases, this will be done first
		
		System.out.println("This is done before every other class");
	}
	
	@AfterSuite
	public void RemoveSoftware()
	{
		System.out.println("I'm after everything");
	}

}
