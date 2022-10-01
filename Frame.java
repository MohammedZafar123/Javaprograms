package week2.day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	@Test
	public void run() {		
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        driver.switchTo().frame(0);//index start from 0
        WebElement frame1 = driver.findElement(By.id("//button[text()='Try it']"));
        frame1.click();
	}

}
