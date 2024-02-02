package com.qa.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\For automation\\HRY Pratice\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com");
	    WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	   if(closeButton.isDisplayed()) {
		   closeButton.click();
	   }
	   WebElement searchField = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	   searchField.sendKeys("macbook pro");
	   try {
		Thread.sleep(4);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
	  List<WebElement> suggestList = driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
	  for (WebElement webElement : suggestList) {
		  String suggestOptions = webElement.getText();
		  System.out.println(suggestOptions);
		
	}
	  

	   
	}

}
