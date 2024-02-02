package com.qa.CrossBowser2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser2 {

	private static WebDriver driver;

	public static void main(String[] args) throws IOException {

    String path = System.getProperty("user.dir");
    System.out.println(path);

    File file =new File(path+"\\configuration\\config.properties");
    
    FileInputStream fis= new FileInputStream(file);
    
    Properties pro = new Properties();
    pro.load(fis);
    
    String browser = pro.getProperty("browser");
    System.out.println(browser);
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");

    if (browser.equalsIgnoreCase("chrome")) 
    
    {
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
    }
    
    if (browser.equalsIgnoreCase("firefox")) 
    {
		System.setProperty("webdriver.gecko.driver", path+"\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	driver.get(pro.getProperty("url"));
	
    driver.findElement(By.xpath(pro.getProperty("path"))).sendKeys(pro.getProperty("input"));
	}
	
}
