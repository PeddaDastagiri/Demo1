package com.qa.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\For automation\\HRY Pratice\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	   
	    
	    WebElement dropdown=  driver.findElement(By.id("course"));
	    
	     Select  dds = new Select(dropdown);
	    
	     
	     List<WebElement>  coursenamedropdownnames = dds.getOptions();
	     
	     System.out.println(coursenamedropdownnames.size());
		 
		    for (WebElement options : coursenamedropdownnames) {
		    	System.out.println(options.getText());
		    }
	    dds.selectByIndex(0);
	    Thread.sleep(3000);
	    dds.selectByValue("python");
	    Thread.sleep(3000);
	    dds.selectByVisibleText("Dot Net");
	  
	    	
	    	
	    String firstselectCname=dds.getFirstSelectedOption().getText();
	    System.out.println("firstselectCname : "+firstselectCname);
		}
	    
	    
	}

