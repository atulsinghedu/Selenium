package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class question1 {

//	1) Perform the following test cases.
//	TestCase 1- Open Chrome browser and go to https://www.ebay.com/
//	TestCase 2- Hover your mouse to the “Electronics” element from the nav bar
//	TestCase 3- Click on “Apple” under Electronics Element
//	TestCase 4- scroll down the page until you see All listings
//	TestCase4- Fetch all the mobile phones listed in the product listing page(All Listings) along with their prices and Print them on the console screen
//	TestCase5- Create an Excel file and output all the products listed along with their prices in the Excel file
	
	WebDriver driver = new ChromeDriver();
	@Test
	public void case1() {
		  driver.get("https://www.ebay.com/");
	}
	
	
	
	}



