package com.telus.seleniumtraining.MavenDemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class RegisterDemoTestNGWithSysOut {


	// Declare all the variables

	// Declare a variable for WebDriver
	public WebDriver driver;

	// Parameterize all the input values
	// Declare variables for all input Values / Test Data
	String url = "https://nxtgenaiacademy.com/";
	String expRegTitleText = "Register For Demo";
	String firstNameValue = "Bhagwan";
	String lastNameValue = "Singh";
	String streetAddressValue = "R Colony";
	String buildingValue = "Ram Bhawan";
	String cityValue ="Jodhpur";
	String stateValue ="Rajasthan";
	String zipCodeValue = "342301";
	String countryDDValue="India";
	String eMailValue = "bhagwan@gmail.com";
	String dateOfDemoValue = "27/07/2022";
	String hoursSelectorValue="16";
	String minuteSelectorValue="30";
	String mobileNumberValue="9828299191";
	String queryValue="My Query";
	String expValidationText = "Registration Form is Successfully Submitted. The Transaction ID";

	// Parameterize all the Locators for WebElements 
	String qaAutomationLocator ="QA AUTOMATION";
	String practiceAutomationLocator = "Practice Automation";
	String registrationFormLocator = "Registration Form";	
	String regTitleTextLocator = "//*[text() = 'Register For Demo']";
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String maleRadioBtnLocator = "vfb-8-1";  
	String streetAddressLocator = "vfb-13-address";
	String buildingLocator = "vfb-13-address-2";
	String cityLocator = "vfb-13-city";
	String stateLocator = "vfb-13-state";
	String zipCodeLocator = "vfb-13-zip";
	String countryDropDownLocator = "vfb-13-country";
	String eMailLocator = "vfb-14";
	String dateOfDemoLocator = "vfb-18";
	String hourSelectorLocator= "vfb-16-hour";
	String minuteSelectorLocator = "vfb-16-min";
	String mobileNumberLocator = "vfb-19";
	String chkBoxForSeliniumWebDriverLocator = "vfb-20-0";
	String chkBoxForUFTLocator = "vfb-20-1";
	String queryLocator = "vfb-23";
	String verificationNoFieldLocator = "vfb-3";		
	String verificationNoTextLocator = "//*[@id = 'item-vfb-2']";
	String subMitBtnLocator = "vfb-4";	
	String validationSuccessfulMsgTextLocator ="//*[contains(text(),'Registration Form is Successfully Submitted')]";



	// Create methods for Particular Functionalities


	// Method 1. Launch The Application
	// Create a method for launching the Application
	@Test(priority=1)
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


	// Method 2. Navigate to Register For Demo Page
	//  Create a method to navigate to the Registration Page
	@Test(priority=2)
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

	// Method 3. Validate the Title Of the Page
	// Create a method to validate the title of the Page
	@Test(priority=3)
	public void validateTitle() {

		// Validate the title text "Register For Demo"
		// Declare the WebElement object for title text
		WebElement regTitleText =driver.findElement(By.xpath(regTitleTextLocator));

		// Retrieve title text from page
		String actRegTitleText = regTitleText.getText();

		// Verify the Expected and Actual title text are same or not
		if(actRegTitleText.equals(expRegTitleText)) { 

			System.out.println("The Registration Title of the page is "+ actRegTitleText);
		}
		else {

			System.out.println("Actual and Expected Registration title are not same");
			System.out.println("Actual Registration Title is "+actRegTitleText);
			System.out.println("Expected Registration Title is "+expRegTitleText);
		}

		System.out.println("========================================================");

	}

	// Method 4. Enter The User Details
	// Create a method to Enter the User Details
	@Test(priority=4)
	public void registerUser() {

		// Register User
		// First Name input
		// Declare a WebElement object for First Name
		WebElement firstName = driver.findElement(By.id(firstNameLocator));

		// Verify the first name is enabled or not
		if(firstName.isEnabled()) {

			System.out.println("First Name is enabled");

			// Enter the First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name is " + firstNameValue);

		}
		else {

			System.out.println("First Name is not enabled");

		}

		System.out.println("========================================================");

		// Last Name input
		// Declare a WebElement object for Last Name
		WebElement lastName = driver.findElement(By.id(lastNameLocator));

		// Verify the Last name is enabled or not
		if(lastName.isEnabled()) {

			System.out.println("Last Name is enabled");

			// Enter the Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name is " + lastNameValue);

		}
		else{

			System.out.println("Last Name is not enabled");

		}

		System.out.println("========================================================");
		// Gender 
		// Male radio button
		// Declare a WebElement object for male radio button
		WebElement maleRadioBtn = driver.findElement(By.id(maleRadioBtnLocator));

		// Verify the Male Radio Button is selected
		if(maleRadioBtn.isSelected()) {

			System.out.println("Male Radio Button is selected");

		}
		else {
			System.out.println("Male Radio Button is not selected");

			// Click the Male Radio Button
			maleRadioBtn.click();
			System.out.println("Male Radio Button is selected");
		}

		System.out.println("========================================================");

		// Address1/Street Address field 
		// Declare a WebElement object for Address1/Street Address field
		WebElement streetAddress = driver.findElement(By.id(streetAddressLocator));

		// Verify the Street Address field is enabled or not
		if(streetAddress.isEnabled()) {

			System.out.println("Street Address Field is enabled");

			// Enter the Address1/Street Address
			streetAddress.sendKeys(streetAddressValue);
			System.out.println("Street Address is " + streetAddressValue);
		}
		else {

			System.out.println("Street Address field is not enabled");

		}


		System.out.println("========================================================");

		//Aptt /Suit /Building field 
		// Declare a WebElement object for Building field
		WebElement building = driver.findElement(By.id(buildingLocator));

		// Verify the Building field is enabled or not
		if(building.isEnabled()) {

			System.out.println("Building field is enabled");

			// Enter the Address2/building 
			building.sendKeys(buildingValue);
			System.out.println("Address2/Building field is " + buildingValue);

		}
		else{

			System.out.println("Building field is not enabled");

		}

		System.out.println("========================================================");

		// City field 
		// Declare a WebElement object for City field
		WebElement city = driver.findElement(By.id(cityLocator));

		// Verify the City field is enabled or not
		if(city.isEnabled()) {

			System.out.println("City field is enabled");

			// Enter the City 
			city.sendKeys(cityValue);
			System.out.println("City field is " + cityValue);
		}
		else{

			System.out.println("City field is not enabled");

		}

		System.out.println("========================================================");

		// State field 
		// Declare a WebElement object for State field
		WebElement state = driver.findElement(By.id(stateLocator));

		// Verify the State field is enabled or not
		if(state.isEnabled()) {

			System.out.println("State field is enabled");

			// Enter the State 
			state.sendKeys(stateValue);
			System.out.println("State field is " + stateValue);

		}
		else{

			System.out.println("State field is not enabled");

		}

		System.out.println("========================================================");

		// zipCode field 
		// Declare a WebElement object for zipCode field
		WebElement zipCode = driver.findElement(By.id(zipCodeLocator));

		// Verify the ZipCode field is enabled or not
		if(zipCode.isEnabled()) {

			System.out.println("ZipCode field is enabled");

			// Enter the zipCode  
			zipCode.sendKeys(zipCodeValue);
			System.out.println("ZipCode field is " + zipCodeValue);

		}
		else{

			System.out.println("ZipCode field is not enabled");
		}


		System.out.println("========================================================");


		// countryDD Selector field 

		// Declare a WebElement object for countryDD Selector field
		WebElement countryDropDown = driver.findElement(By.id(countryDropDownLocator));

		// Verify the Country Drop Down is Enabled
		if(countryDropDown.isEnabled()) {

			System.out.println("Country Drop Down is enabled");


			// Create the select object to select value from drop down
			Select countryDD= new Select(countryDropDown);

			// Select using value (countryDDValue = India)
			countryDD.selectByValue(countryDDValue);
			System.out.println("Country Drop Down Value is selected");
			System.out.println("Country Drop Down Value is "+countryDDValue);
		}
		else{

			System.out.println("Country Drop Down  is not Enabled");

		}


		System.out.println("========================================================");

		// eMail field 
		// Declare a WebElement object for eMail field
		WebElement eMail = driver.findElement(By.id(eMailLocator));

		// Verify the  E Mail field is enabled or not
		if(eMail.isEnabled()) {

			System.out.println("E Mail field is enabled");

			// Enter the E Mail  
			eMail.sendKeys(eMailValue);
			System.out.println("E Mail field is " + eMailValue);
		}
		else {

			System.out.println("E Mail field is not enabled");
		}

		System.out.println("========================================================");

		// dateOfDemo field 
		// Declare a WebElement object for dateOfDemo field
		WebElement dateOfDemo = driver.findElement(By.id(dateOfDemoLocator));

		// Verify the  dateOfDemo field is enabled or not
		if(dateOfDemo.isEnabled()) {

			System.out.println("DateOfDemo field is enabled");

			// Enter the  dateOfDemo  
			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println("DateOfDemo field is " + dateOfDemoValue);
		}
		else {

			System.out.println("dateOfDemo field is not enabled");
		}

		System.out.println("========================================================");

		// Convenient Time Selector
		// hourSelector 
		// Declare a WebElement object for hours Selector field
		WebElement hourSelector = driver.findElement(By.id(hourSelectorLocator));

		// Verify hourSelector Drop Down is Enabled
		if(hourSelector.isEnabled()) {

			System.out.println("Hour Selector Drop Down is Enabled");

			// Create the select object to select value from drop down
			Select hoursSelector= new Select(hourSelector);

			// Select using value (hoursSelectorValue = 16)
			hoursSelector.selectByValue(hoursSelectorValue);
			System.out.println("Selected Hour is " + hoursSelectorValue);
		}
		else {

			System.out.println("Hour Selector Drop Down is not Enabled");

		}

		System.out.println("========================================================");

		// minuteSelector 
		// Declare a WebElement object for minutes Selector field
		WebElement minuteSelector = driver.findElement(By.id(minuteSelectorLocator));

		// Verify minuteSelector Drop Down is Enabled
		if(minuteSelector.isEnabled()) {

			System.out.println("Minute Selector Drop Down is Enabled");

			// Create the select object to select value from drop down
			Select minutesSelector= new Select(minuteSelector);

			// Select using value (minuteSelectorValue = 30)
			minutesSelector.selectByValue(minuteSelectorValue);
			System.out.println("Selected Minute is " + minuteSelectorValue);
		}
		else {

			System.out.println("Minute Selector Drop Down is not Enabled");

		}

		System.out.println("========================================================");

		// mobileNumber field 
		// Declare a WebElement object for mobileNumber field
		WebElement mobileNumber = driver.findElement(By.id(mobileNumberLocator));

		// Verify the  mobileNumber field is enabled or not
		if(mobileNumber.isEnabled()) {

			System.out.println("mobileNumber field is enabled");

			// Enter the mobileNumber  
			mobileNumber.sendKeys(mobileNumberValue);
			System.out.println("Mobile Number field is " + mobileNumberValue);

		}
		else{

			System.out.println("Mobile Number field is not enabled");
		}

		System.out.println("========================================================");

		// checkBox Selector
		// CheckBox for Selinium Webdriver
		// Declare a WebElement object for Selinium Webdriver Check Box
		WebElement chkBoxForSeliniumWebDriver = driver.findElement(By.id(chkBoxForSeliniumWebDriverLocator));

		// Verify the  Check box For SeliniumWebDriver is Selected or not
		if(chkBoxForSeliniumWebDriver.isSelected()) {

			System.out.println("CheckBox for SeliniumWebDriver is Selected");
		}
		else {
			System.out.println("CheckBox for SeliniumWebDriver is not Selected");

			// Click / Check the Check Box
			chkBoxForSeliniumWebDriver.click();

			System.out.println("CheckBox checked for is 'SeliniumWebDriver' ");

		}

		System.out.println("========================================================");

		// checkBox Selector
		// CheckBox for UFT
		// Declare a WebElement object for UFT Check Box
		WebElement chkBoxForUFT = driver.findElement(By.id(chkBoxForUFTLocator));

		// Verify the  Check box For UFT is Selected or not
		if(chkBoxForUFT.isSelected()) {

			System.out.println("CheckBox for UFT is Selected");

		}
		else {

			System.out.println("CheckBox for UFT is not Selected");

			// Click / Check the Check Box
			chkBoxForUFT.click();

			System.out.println("CheckBox checked for is 'UFT' ");

		}


		System.out.println("========================================================");


		// Enter your Query Field
		// Declare a WebElement object for Query field
		WebElement query = driver.findElement(By.id(queryLocator));

		// Verify the  Enter your Query field is enabled or not
		if(query.isEnabled()) {

			System.out.println("Query field is enabled");

			// Enter your Query  
			query.sendKeys(queryValue);
			System.out.println("Query field is " + queryValue);

		}
		else {

			System.out.println("Query field is not enabled");

		}

		System.out.println("========================================================");

		// verification field 
		// Declare a WebElement object for verification field
		WebElement verificationNoField = driver.findElement(By.id(verificationNoFieldLocator));

		// Declare a WebElement object for verification No Text
		WebElement verificationNoText = driver.findElement(By.xpath(verificationNoTextLocator));

		// Declare a String variable for Retrieved "verificationNoText"
		String verificationNoTextString = verificationNoText.getText();

		// Split out the "verificationNoTextString" with colon and store in an array
		String arrVerificationNoTextString[] = verificationNoTextString.split(":");                

		// Store Splitted "verificationNumber" in a variable and trim it
		String verificationNumber = arrVerificationNoTextString[1].trim();


		// Verify Verification No field is enabled or not
		if(verificationNoField.isEnabled()) {

			System.out.println("Verification no Field is Enabled ");

			// Pass the trimmed value to the "verificationNoField"
			verificationNoField.sendKeys(verificationNumber);

			System.out.println("Verification no is "+verificationNumber);

		}
		else {

			System.out.println("Verification no Field is not Enabled ");

		}


		System.out.println("========================================================");

		// Click the Submit Button
		// Declare a WebElement object Submit Button
		WebElement subMitBtn = driver.findElement(By.id(subMitBtnLocator));

		// Verify the submitted button Enabled or not
		if(subMitBtn.isEnabled()) {

			System.out.println("Submit Button is enabled");

			// Click Submit Button 
			subMitBtn.click();
			System.out.println("Submit button is Clicked");

		}
		else{

			System.out.println("submit Button is not enabled");

		}


		System.out.println("========================================================");


	}


	// Method 5. Validate the Successful message
	// Create a method for validation of Successful message
	@Test(priority=5)
	public void successfulValidation() {

		// Validate the text "Registration Form is Successfully Submitted. Transaction ID : XXXXXXXXXXXXX "
		// Declare the WebElement object for Validation Text
		WebElement validationSuccessfulMsgText =driver.findElement(By.xpath(validationSuccessfulMsgTextLocator));

		// Retrieve Validation Text from Page
		String actValidationText = validationSuccessfulMsgText.getText();

		// Split the Validation text with ":" and store in an array
		String arrActValidationText[] = actValidationText.split(":");

		// Store trimmed validation text in a variable
		String splittedValidationText = arrActValidationText[0].trim();

		// Verify if Expected Validation Text and Actual Validation Text are same 
		if(splittedValidationText.contains(expValidationText)) {

			System.out.println("Registration form is Successfully Submitted!!");
			System.out.println("Successful message is validated");
			System.out.println("Actual and Expected Successful message Texts are same");
			System.out.println("Successful message Text is "+ actValidationText);

		}
		else {

			System.out.println("Actual and Expected Successful message Texts are not same");
			System.out.println("Actual Successful message Text is "+ splittedValidationText);
			System.out.println("Expected Successful message Text is "+ expValidationText);

		}

		System.out.println("========================================================");

	}


	// Method 6. Close the Application
	// Create a method for closing the Application
	@Test(priority=6)
	public void closeApplication() {

		// close the application
		driver.close();
		System.out.println("Application is closed");

		System.out.println("========================================================");

	}
}
