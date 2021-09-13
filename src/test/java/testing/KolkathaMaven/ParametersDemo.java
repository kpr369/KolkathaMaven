package testing.KolkathaMaven;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	
	@Test
	@Parameters({"arg1"})
	public void print(@Optional("chrome") String browser)
	{
		System.out.println(browser);
	
	}
	
	@Test
	public void test()
	{
		System.out.println("Test");
	}

}