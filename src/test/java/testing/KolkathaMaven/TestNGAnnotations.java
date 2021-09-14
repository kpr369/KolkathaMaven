package testing.KolkathaMaven;

import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test(priority=2,description="Test Method")
	public void best()
	{
		System.out.println("Best");
	}
	
	
	@Test(dependsOnMethods="login", alwaysRun = true)
	public void homepage()
	{
		System.out.println("HomePage");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println(5/0);
		System.out.println(5/2);
	}

}
