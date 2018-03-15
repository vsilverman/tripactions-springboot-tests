package com.tripactions.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 

public class WebDriverTest {
	
	public static void testDemoApp() {
		// objects and variables instantiation
		System.setProperty("webdriver.chrome.driver", "\\Flash1\\1\\Selenium\\chromedriver.exe");

//	   	WebDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String appUrl = "https://tripactions.com/";
          
//launch the browser and open the application url
        driver.get(appUrl);
          
//declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = "TripActions - Corporate Travel Management That Works";
          
//fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
          
//compare the expected title of the page with the actual title of the page and print the result
        if (expectedTitle.equals(actualTitle))
               System.out.println("Verification Successful - The correct title is displayed on the web page.");
        else
                System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

        // maximize the browser window
        driver.manage().window().maximize();
          
        driver.get(appUrl + "request-demo");
        WebElement fn = driver.findElement(By.id("FirstName"));
        fn.clear();
        fn.sendKeys("Test-First-Name");

        WebElement ln = driver.findElement(By.id("LastName"));
        ln.clear();
        ln.sendKeys("Test-Last-Name");
        
        driver.findElement(By.id("Email")).click();
	    driver.findElement(By.id("Email")).clear();
    	driver.findElement(By.id("Email")).sendKeys("email-address@company.com");
    	driver.findElement(By.id("Phone")).click();
    	driver.findElement(By.id("Phone")).clear();
    	driver.findElement(By.id("Phone")).sendKeys("123-456-7890");
    	driver.findElement(By.id("Company")).click();
    	driver.findElement(By.id("Company")).clear();
    	driver.findElement(By.id("Company")).sendKeys("Company-Name");
    	driver.findElement(By.id("Title")).click();
    	driver.findElement(By.id("Title")).clear();
    	driver.findElement(By.id("Title")).sendKeys("Position-Title");
    	driver.findElement(By.id("Company_Size__c")).click();
    	new Select(driver.findElement(By.id("Company_Size__c"))).selectByVisibleText("1500+");
    	driver.findElement(By.id("Company_Size__c")).click();

//    driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement demoButton = driver.findElement(By.xpath("//button[@type='submit']"));
        demoButton.click();
           
//close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");
          
//terminate the program
        System.exit(0);
	}
	
/**
* @param args
*/
       public static void main(String[] args) {
             testDemoApp();
       }
}
