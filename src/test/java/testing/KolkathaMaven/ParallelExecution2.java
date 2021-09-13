package testing.KolkathaMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	
	

	@Test
	public void googleTest() {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Open Browser

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium1");
	}
	
	
	@Test
	public void googleTest1() {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Open Browser

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java1");
	}
	
	@Test
	public void googleTest2() {

		System.setProperty("webdriver.chrome.driver", "Z:\\Selenium Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Open Browser

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("TestNg1");
	}

}
