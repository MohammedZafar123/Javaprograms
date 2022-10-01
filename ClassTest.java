package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver chrome=new ChromeDriver(ch);
		chrome.get("https://login.salesforce.com/?locale=in");
		chrome.findElement(By.xpath(null))
		
		
	}

}
