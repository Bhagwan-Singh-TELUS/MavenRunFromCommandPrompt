package com.telus.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class RegisterDemoEndToEndTestNG {


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
		Reporter.log("Application url is Successfully Launched");
		Reporter.log("========================================================");

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
		Reporter.log("Navigated to Registration Form Page");
		Reporter.log("========================================================");

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
			Reporter.log("The Registration Title of the page is successfully validated");
			Reporter.log("The Registration Title of the page is : "+ actRegTitleText);
		}
		else {

			Reporter.log("Actual and Expected Registration title are not same");
			Reporter.log("Actual Registration Title is "+actRegTitleText);
			Reporter.log("Expected Registration Title is "+expRegTitleText);
		}

		Reporter.log("========================================================");

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

			Reporter.log("First Name input field is enabled");

			// Enter the First Name
			firstName.sendKeys(firstNameValue);
			Reporter.log("First Name value is : " + firstNameValue);

		}
		else {

			Reporter.log("First Name input field is not enabled");

		}

		Reporter.log("========================================================");

		// Last Name input
		// Declare a WebElement object for Last Name
		WebElement lastName = driver.findElement(By.id(lastNameLocator));

		// Verify the Last name is enabled or not
		if(lastName.isEnabled()) {

			Reporter.log("Last Name input field is enabled");

			// Enter the Last Name
			lastName.sendKeys(lastNameValue);
			Reporter.log("Last Name value is : " + lastNameValue);

		}
		else{

			Reporter.log("Last Name is not enabled");

		}

		Reporter.log("========================================================");
		// Gender 
		// Male radio button
		// Declare a WebElement object for male radio button
		WebElement maleRadioBtn = driver.findElement(By.id(maleRadioBtnLocator));

		// Verify the Male Radio Button is selected
		if(maleRadioBtn.isSelected()) {

			Reporter.log("Male Radio Button is selected");

		}
		else {
			Reporter.log("Male Radio Button is not selected");

			// Click the Male Radio Button
			maleRadioBtn.click();
			Reporter.log("Male Radio Button is selected");
		}

		Reporter.log("========================================================");

		// Address1/Street Address field 
		// Declare a WebElement object for Address1/Street Address field
		WebElement streetAddress = driver.findElement(By.id(streetAddressLocator));

		// Verify the Street Address field is enabled or not
		if(streetAddress.isEnabled()) {

			Reporter.log("Street Address input Field is enabled");

			// Enter the Address1/Street Address
			streetAddress.sendKeys(streetAddressValue);
			Reporter.log("Street Address value is : " + streetAddressValue);
		}
		else {

			Reporter.log("Street Address input field is not enabled");

		}


		Reporter.log("========================================================");

		//Aptt /Suit /Building field 
		// Declare a WebElement object for Building field
		WebElement building = driver.findElement(By.id(buildingLocator));

		// Verify the Building field is enabled or not
		if(building.isEnabled()) {

			Reporter.log("Building input field is enabled");

			// Enter the Address2/building 
			building.sendKeys(buildingValue);
			Reporter.log("Address2/Building field value is : " + buildingValue);

		}
		else{

			Reporter.log("Building input field is not enabled");

		}

		Reporter.log("========================================================");

		// City field 
		// Declare a WebElement object for City field
		WebElement city = driver.findElement(By.id(cityLocator));

		// Verify the City field is enabled or not
		if(city.isEnabled()) {

			Reporter.log("City input field is enabled");

			// Enter the City 
			city.sendKeys(cityValue);
			Reporter.log("City field value is : " + cityValue);
		}
		else{

			Reporter.log("City input field is not enabled");

		}

		Reporter.log("========================================================");

		// State field 
		// Declare a WebElement object for State field
		WebElement state = driver.findElement(By.id(stateLocator));

		// Verify the State field is enabled or not
		if(state.isEnabled()) {

			Reporter.log("State input field is enabled");

			// Enter the State 
			state.sendKeys(stateValue);
			Reporter.log("State field value is : " + stateValue);

		}
		else{

			Reporter.log("State input field is not enabled");

		}

		Reporter.log("========================================================");

		// zipCode field 
		// Declare a WebElement object for zipCode field
		WebElement zipCode = driver.findElement(By.id(zipCodeLocator));

		// Verify the ZipCode field is enabled or not
		if(zipCode.isEnabled()) {

			Reporter.log("ZipCode input field is enabled");

			// Enter the zipCode  
			zipCode.sendKeys(zipCodeValue);
			Reporter.log("ZipCode field value is : " + zipCodeValue);

		}
		else{

			Reporter.log("ZipCode input field is not enabled");
		}


		Reporter.log("========================================================");


		// countryDD Selector field 

		// Declare a WebElement object for countryDD Selector field
		WebElement countryDropDown = driver.findElement(By.id(countryDropDownLocator));

		// Verify the Country Drop Down is Enabled
		if(countryDropDown.isEnabled()) {

			Reporter.log("Country Drop Down is enabled");


			// Create the select object to select value from drop down
			Select countryDD= new Select(countryDropDown);

			// Select using value (countryDDValue = India)
			countryDD.selectByValue(countryDDValue);
			Reporter.log("Country Drop Down Value is selected");
			Reporter.log("Country Drop Down Value is : "+countryDDValue);
		}
		else{

			Reporter.log("Country Drop Down  is not Enabled");

		}


		Reporter.log("========================================================");

		// eMail field 
		// Declare a WebElement object for eMail field
		WebElement eMail = driver.findElement(By.id(eMailLocator));

		// Verify the  E Mail field is enabled or not
		if(eMail.isEnabled()) {

			Reporter.log("E Mail input field is enabled");

			// Enter the E Mail  
			eMail.sendKeys(eMailValue);
			Reporter.log("E Mail field value is : " + eMailValue);
		}
		else {

			Reporter.log("E Mail input field is not enabled");
		}

		Reporter.log("========================================================");

		// dateOfDemo field 
		// Declare a WebElement object for dateOfDemo field
		WebElement dateOfDemo = driver.findElement(By.id(dateOfDemoLocator));

		// Verify the  dateOfDemo field is enabled or not
		if(dateOfDemo.isEnabled()) {

			Reporter.log("DateOfDemo input field is enabled");

			// Enter the  dateOfDemo  
			dateOfDemo.sendKeys(dateOfDemoValue);
			Reporter.log("DateOfDemo field value is : " + dateOfDemoValue);
		}
		else {

			Reporter.log("dateOfDemo input field is not enabled");
		}

		Reporter.log("========================================================");

		// Convenient Time Selector
		// hourSelector 
		// Declare a WebElement object for hours Selector field
		WebElement hourSelector = driver.findElement(By.id(hourSelectorLocator));

		// Verify hourSelector Drop Down is Enabled
		if(hourSelector.isEnabled()) {

			Reporter.log("Hour Selector Drop Down is Enabled");

			// Create the select object to select value from drop down
			Select hoursSelector= new Select(hourSelector);

			// Select using value (hoursSelectorValue = 16)
			hoursSelector.selectByValue(hoursSelectorValue);
			Reporter.log("Selected Hour is : " + hoursSelectorValue);
		}
		else {

			Reporter.log("Hour Selector Drop Down is not Enabled");

		}

		Reporter.log("========================================================");

		// minuteSelector 
		// Declare a WebElement object for minutes Selector field
		WebElement minuteSelector = driver.findElement(By.id(minuteSelectorLocator));

		// Verify minuteSelector Drop Down is Enabled
		if(minuteSelector.isEnabled()) {

			Reporter.log("Minute Selector Drop Down is Enabled");

			// Create the select object to select value from drop down
			Select minutesSelector= new Select(minuteSelector);

			// Select using value (minuteSelectorValue = 30)
			minutesSelector.selectByValue(minuteSelectorValue);
			Reporter.log("Selected Minute is : " + minuteSelectorValue);
		}
		else {

			Reporter.log("Minute Selector Drop Down is not Enabled");

		}

		Reporter.log("========================================================");

		// mobileNumber field 
		// Declare a WebElement object for mobileNumber field
		WebElement mobileNumber = driver.findElement(By.id(mobileNumberLocator));

		// Verify the  mobileNumber field is enabled or not
		if(mobileNumber.isEnabled()) {

			Reporter.log("mobileNumber input field is enabled");

			// Enter the mobileNumber  
			mobileNumber.sendKeys(mobileNumberValue);
			Reporter.log("Mobile Number field value is : " + mobileNumberValue);

		}
		else{

			Reporter.log("Mobile Number input field is not enabled");
		}

		Reporter.log("========================================================");

		// checkBox Selector
		// CheckBox for Selinium Webdriver
		// Declare a WebElement object for Selinium Webdriver Check Box
		WebElement chkBoxForSeliniumWebDriver = driver.findElement(By.id(chkBoxForSeliniumWebDriverLocator));

		// Verify the  Check box For SeliniumWebDriver is Selected or not
		if(chkBoxForSeliniumWebDriver.isSelected()) {

			Reporter.log("CheckBox for SeliniumWebDriver is Selected");
		}
		else {
			Reporter.log("CheckBox for SeliniumWebDriver is not Selected");

			// Click / Check the Check Box
			chkBoxForSeliniumWebDriver.click();

			Reporter.log("CheckBox checked for is : 'SeliniumWebDriver' ");

		}

		Reporter.log("========================================================");

		// checkBox Selector
		// CheckBox for UFT
		// Declare a WebElement object for UFT Check Box
		WebElement chkBoxForUFT = driver.findElement(By.id(chkBoxForUFTLocator));

		// Verify the  Check box For UFT is Selected or not
		if(chkBoxForUFT.isSelected()) {

			Reporter.log("CheckBox for UFT is Selected");

		}
		else {

			Reporter.log("CheckBox for UFT is not Selected");

			// Click / Check the Check Box
			chkBoxForUFT.click();

			Reporter.log("CheckBox checked for is : 'UFT' ");

		}


		Reporter.log("========================================================");


		// Enter your Query Field
		// Declare a WebElement object for Query field
		WebElement query = driver.findElement(By.id(queryLocator));

		// Verify the  Enter your Query field is enabled or not
		if(query.isEnabled()) {

			Reporter.log("Query input field is enabled");

			// Enter your Query  
			query.sendKeys(queryValue);
			Reporter.log("Query field value is : " + queryValue);

		}
		else {

			Reporter.log("Query input field is not enabled");

		}

		Reporter.log("========================================================");

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

			Reporter.log("Verification no input Field is Enabled ");

			// Pass the trimmed value to the "verificationNoField"
			verificationNoField.sendKeys(verificationNumber);

			Reporter.log("Verification no value is : "+verificationNumber);

		}
		else {

			Reporter.log("Verification no input Field is not Enabled ");

		}


		Reporter.log("========================================================");

		// Click the Submit Button
		// Declare a WebElement object Submit Button
		WebElement subMitBtn = driver.findElement(By.id(subMitBtnLocator));

		// Verify the submitted button Enabled or not
		if(subMitBtn.isEnabled()) {

			Reporter.log("Submit Button is enabled");

			// Click Submit Button 
			subMitBtn.click();
			Reporter.log("Submit button is Clicked");

		}
		else{

			Reporter.log("submit Button is not enabled");

		}


		Reporter.log("========================================================");


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

			Reporter.log("Registration form is Successfully Submitted!!");
			Reporter.log("Successful message is validated");
			Reporter.log("Actual and Expected Successful message Texts are same");
			Reporter.log("Successful message Text is : "+ actValidationText);

		}
		else {

			Reporter.log("Actual and Expected Successful message Texts are not same");
			Reporter.log("Actual Successful message Text is "+ splittedValidationText);
			Reporter.log("Expected Successful message Text is "+ expValidationText);

		}

		Reporter.log("========================================================");

	}


	// Method 6. Close the Application
	// Create a method for closing the Application
	@Test(priority=6)
	public void closeApplication() {

		// close the application
		driver.close();
		Reporter.log("Application is closed");

		Reporter.log("========================================================");

	}
}
