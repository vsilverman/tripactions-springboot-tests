package com.tripactions.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private WebDriver driver;
	private String baseUrl;


	@Test
	public void contextLoads() {
		System.setProperty("webdriver.chrome.driver", "\\Flash1\\1\\Selenium\\chromedriver.exe");
//      driver = new FirefoxDriver();
    	driver = new ChromeDriver();
//	    baseUrl = "https://www.katalon.com/";
//    	baseUrl = "https://www.tripactions.com/";
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://tripactions.com/");
	    driver.findElement(By.xpath("//div[@onclick='showMainForm()']")).click();
    	driver.findElement(By.id("FirstName")).clear();
    	driver.findElement(By.id("FirstName")).sendKeys("Oleg");
    	driver.findElement(By.id("LastName")).click();
    	driver.findElement(By.id("LastName")).clear();
    	driver.findElement(By.id("LastName")).sendKeys("Gusakov");
    	driver.findElement(By.id("Email")).click();
    	driver.findElement(By.id("Email")).clear();
    	driver.findElement(By.id("Email")).sendKeys("oleg@tripactions.com");
    	driver.findElement(By.id("Phone")).click();
    	driver.findElement(By.id("Phone")).clear();
    	driver.findElement(By.id("Phone")).sendKeys("888-505-3747");
    	driver.findElement(By.id("Company")).click();
    	driver.findElement(By.id("Company")).clear();
    	driver.findElement(By.id("Company")).sendKeys("TripActions");
    	driver.findElement(By.id("Title")).click();
    	driver.findElement(By.id("Title")).clear();
    	driver.findElement(By.id("Title")).sendKeys("QA Engineer");
    	driver.findElement(By.id("Company_Size__c")).click();
    	new Select(driver.findElement(By.id("Company_Size__c"))).selectByVisibleText("1500+");
    	driver.findElement(By.id("Company_Size__c")).click();
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
   	    driver.quit();
	}

	@Test
	public void test2() {
	}

	@Test
	public void test3() {
	}

	@Test
	public void test4() {
	}

	@Test
	public void test5() {
	}

	@Test
	public void test6() {
	}

	@Test
	public void test7() {
	}

	@Test
	public void test8() {
	}

	@Test
	public void test9() {
	}

	@Test
	public void test10() {
	}

	@Test
	public void test11() {
	}

	@Test
	public void test12() {
	}


}
