package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class HomeTest {

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		LoginTest.driver = new ChromeDriver();
		LoginTest.driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		LoginTest.driver.manage().window().maximize();
		LoginTest.driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		LoginTest.driver.findElement(By.id("password")).sendKeys("123456");
		LoginTest.driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		LoginTest.driver.close();
	}
	@Test
	public void test02() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test03() {
		throw new SkipException("skipping test case");
	}
}
