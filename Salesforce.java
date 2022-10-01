package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver chrome=new ChromeDriver(ch);
		chrome.get("https://login.salesforce.com/?locale=in");
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		chrome.findElement(By.xpath("//input[@id='Login']")).click();
		chrome.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		chrome.findElement(By.xpath("//button[text()='View All']")).click();
		chrome.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement clk=chrome.findElement(By.xpath("//a[@title='Accounts']//span[1]"));
		chrome.executeScript("arguments[0].click();", clk);
		chrome.findElement(By.xpath("//div[text()='New']")).click();
		chrome.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Zafar");
		chrome.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[3]"));
		chrome.findElement(By.xpath("//span[text()='Public']")).click();
		chrome.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		String attribute = chrome.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
        System.out.println(attribute);
      if (attribute.contains("Zafar")) {
           System.out.println("verfied");
           }else {
       System.out.println("not verfied"); }
		
	
			
		
		
		
		
		
		
		
		
	}

}
