package pack2;

import org.testng.annotations.Test;

public class DependencyAnnotations {
	
	@Test(enabled=true) 		//self explanatory A. runs 2nd by default (alphabetical)
	public void OpenBrowserB()
	{
	//To open the browser
	System.out.println("Test 1B");
	}
	
	@Test(dependsOnMethods=("OpenBrowserB"), alwaysRun = true)		//self explanatory B runs 1st by default without depends
	public void DoSomethingB()										// Always run will force run even if depends method fails
	{
		System.out.println("Test 2B");
		
	}
	
	@Test(timeOut=5000)
		public void ReliesOnTime()
		{
			// will fail the test if it doesnt finish in time
			// even if it actually passes
		}
}
