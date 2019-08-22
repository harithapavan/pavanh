package org.in.test.Pavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenA {
	
	
	@Test(priority=5)
	public void lanchbro() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Pavan\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("username")).sendKeys("pavankumar");
		driver.findElement(By.id("password")).sendKeys("12345");
	}
	@Test(priority=-17,invocationCount=3)
	private void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Pavan\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pavankumar");
		driver.findElement(By.id("pass")).sendKeys("123456");
	}
	

}
