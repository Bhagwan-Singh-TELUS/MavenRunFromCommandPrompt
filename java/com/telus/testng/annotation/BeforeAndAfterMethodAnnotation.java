package com.telus.testng.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodAnnotation {

	// Declare a variable for WebDriver
	public WebDriver driver;

	// Declare all the variables
	String url = "https://nxtgenaiacademy.com/";
	String qaAutomationLocator ="QA AUTOMATION";
	String practiceAutomationLocator = "Practice Automation";
	String registrationFormLocator = "Registration Form";	


	// Use BeforeClass Annotation for launchApplication Method
	@BeforeMethod
	public void launchApplication() {

		// Set system property for chrome browser
		System.setProperty("webdriver.chrome.driver",".\\Driver.\\chromedriver.exe");

		// create object instance for chrome browser
		driver = new ChromeDriver();

		// Launch the application url
		driver.get(url);

		// Maximize the window
		driver.manage().window().maximize();

		// Print url is Launched
		System.out.println("Application url is Launched");
		System.out.println("========================================================");

	}

	// Use AfterClass Annotation For closeApplication Method
	@AfterMethod
	public void closeApplication() {

		// close the application
		driver.close();
		System.out.println("Application is closed");

		System.out.println("========================================================");

	}

	// Navigate the screen to Register For Demo Page
	@Test(priority=1)
	public void navigateToRegisterForDemo() {

		// Navigate to the register demo page
		// Create object instance for Actions class for Mouse events
		Actions action = new Actions(driver);

		// Perform mouseover above the QA AUTOMATION
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		action.moveToElement(qaAutomation).perform();

		// Perform mouseover above the Practice Automation 
		WebElement practiceAutomation = driver.findElement(By.linkText(practiceAutomationLocator));
		action.moveToElement(practiceAutomation).perform();

		// Click on Registration Form
		WebElement registrationForm = driver.findElement(By.partialLinkText(registrationFormLocator));
		registrationForm.click();

		// Print navigated to Registration Page
		System.out.println("Navigated to Registration Form Page");
		System.out.println("========================================================");

	}
}
