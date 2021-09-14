package testing.KolkathaMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="dataSender")
	public void googleTest(String query) {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Open Browser

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(query);
		driver.findElement(By.name("q")).sendKeys("Java");
		driver.findElement(By.name("q")).sendKeys("Python");

	}
	
		
	@org.testng.annotations.DataProvider
	public Object[] dataSender()
	{
		
		Object [] obj = new Object[3];
		
		obj[0]= "Selenium";
		obj[1] = "Java";
		obj[2]= "Testng";
		
		return obj;
	}
}
