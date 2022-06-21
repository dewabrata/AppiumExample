package com.nexsoft.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TestCalculator {
	/*
	 * {
  "platformName": "Android",
  "appium:appActivity": "com.android.calculator2.Calculator",
  "appium:appPackage": "com.google.android.calculator"
}
	 */

	public CalculatorFunctionTest calc;
	protected AndroidDriver driver;

	@BeforeTest
	public void init() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  
		calc = new CalculatorFunctionTest(driver);
		
		
	}
	
	@Test(priority = 1)
	public void test_functionTambah() {
	
		calc.tambah(5, 5);
		
	}
	
	@Test(priority = 2)
	public void test_functionKurang() {
	
		calc.kurang(5, 5);
		
	}

}
