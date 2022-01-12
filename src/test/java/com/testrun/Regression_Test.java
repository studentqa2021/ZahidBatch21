package com.testrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regression_Test {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();// Yes == up casting 
		driver.get("https://www.amazon.com/");
	}

}
