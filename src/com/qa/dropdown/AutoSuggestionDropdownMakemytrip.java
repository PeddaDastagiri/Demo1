package com.qa.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdownMakemytrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\For automation\\HRY Pratice\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10'][1]")).click();
	    WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
	    from.sendKeys("bangalore");
	    from.sendKeys(Keys.ARROW_DOWN);
	    from.sendKeys(Keys.ENTER);
	}

}
