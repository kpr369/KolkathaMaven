package testing.KolkathaMaven;

import org.testng.annotations.Test;

public class GropusDemo {
	
	@Test(groups= {"Regression"})
	public void test1()
	{
		System.out.println("Regression 1 ");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("SMoke 1");

	}
	@Test(groups= {"smoke"})
	public void test3()
	{
		System.out.println("Smoke 2");

	}
	@Test(groups= {"Regression"})
	public void test4()
	{
		System.out.println("Regressio 2n");
	
	}
	@Test(groups= {"Regression"})
	public void test5()
	{
		System.out.println("Regression 3");

	}


}
