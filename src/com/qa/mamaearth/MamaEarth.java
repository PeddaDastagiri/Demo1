package com.qa.mamaearth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MamaEarth {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\For automation\\HRY Pratice\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://mamaearth.in/");
    WebElement search = driver.findElement(By.xpath("//p[@class='styles_typicalWrapper__1_Uvh']"));
    search.click();
//    JavascriptExecutor jse=(JavascriptExecutor) driver;
//    jse.executeAsyncScript("document.getElementById('searchInputWrapper').value='dattu';");
    //search.sendKeys("dattu");

	}

}
