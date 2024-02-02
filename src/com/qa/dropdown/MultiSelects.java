package com.qa.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelects {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\For automation\\HRY Pratice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("ide"));

		Select dropdownall = new Select(dropdown);

		List<WebElement> dropdownelements= dropdownall.getOptions();
		System.out.println(dropdownelements.size());
		
		
		System.out.println("----------------all dropdown webelements--------------");
		
		for (WebElement webElement : dropdownelements) {
			
			System.out.println(webElement.getText());
			
		}
		
		
		  dropdownall.selectByIndex(0);
		  Thread.sleep(3000);
		  dropdownall.selectByValue("vs");
		  Thread.sleep(3000);
		  dropdownall.selectByVisibleText("NetBeans ");
		  
		  System.out.println("---------------------firstselectelement------------------");
		 String firstselectelement= dropdownall.getFirstSelectedOption().getText();
		 System.out.println(firstselectelement);
		  
		 
		 Thread.sleep(3000);
	     dropdownall.deselectByValue("vs");
	     Thread.sleep(3000);
	     dropdownall.selectByVisibleText("IntelliJ IDEA");
	     Thread.sleep(3000);
	     dropdownall.selectByValue("vs");
		  
	     
	     
	     System.out.println("----------------allselectedIDE-------------------");
		  List<WebElement> allselectedIDE  =  dropdownall.getAllSelectedOptions();
		  for (WebElement webElement : allselectedIDE) {
			  System.out.println(webElement.getText());
			
		}

	}

}
