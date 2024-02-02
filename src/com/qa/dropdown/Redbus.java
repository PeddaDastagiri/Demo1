package com.qa.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\For automation\\HRY Pratice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		Thread.sleep(3000);
		WebElement from = driver.findElement(By.xpath("//*[@id=\"src\"]"));
		from.click();
		from.sendKeys("jammalama");
		List<WebElement> fromOptions = driver.findElements(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul"));
		for (int i = 0; i <fromOptions.size(); i++) {
			String Option = fromOptions.get(i).getText();
			if(Option.equalsIgnoreCase("jammalamadugu")) {
				fromOptions.get(i).click();
				System.out.println("From :-"+Option);
				break;
			}
		}
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.click();
		to.sendKeys("bangalore");
		List<WebElement> toOptions = driver.findElements(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul"));
		for(int i=0;i<toOptions.size();i++) {
			String option1 = toOptions.get(i).getText();
			//System.out.println("to Options :-"+option1);
			if(option1.equals("Majestic, Bangalore")) {
				Thread.sleep(5000);
				toOptions.get(i).click();
				break;
			}
			
			
		}
	}

}
