package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPrice {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://en-gb.facebook.com/");
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		chrome.findElement(By.xpath("//a[text()='Create New Account']")).click();
		chrome.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Zafar");
		chrome.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ali");
		chrome.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8124636196");
		chrome.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Zafar@1989");
		WebElement day = chrome.findElement(By.id("day"));
		Select select=new Select(day);
		select.selectByValue("19");
		WebElement month =chrome.findElement(By.xpath("//select[@id='month']"));
		Select selectMonth=new Select(month);
		selectMonth.selectByValue("02");
		WebElement year =chrome.findElement(By.xpath("//select[@id='year']"));
		Select selectYear=new Select(year);
		selectYear.selectByValue("1989");
		chrome.findElement(By.xpath("//label[text()='Male']")).click();
		chrome.findElement(By.xpath(  ))
	}

}
