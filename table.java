package week2.day1;

import java.awt.Dimension;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {
	public static void main(String[] args) throws InterruptedException {
		//Steps:
			//1. Navigate to https://erail.in/
			//2. Clear(.clear) the text in source and enter (sendkeys("ms",keys.tab))"ms" and tab
			//3. Clear the text in destination and enter "mdu" and tab
			//4. Uncheck sort on date(use .click)
			//5. Get all  the train names and verify whether any duplicate train name is there or not
			//tips:
			//Table Class Name :DataTable TrainList TrainListHeader stickyTrainListHeader
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement fromsta = driver.findElement(By.id("txtStationFrom"));
	        fromsta.clear();
	    	Thread.sleep(2000);
        fromsta.sendKeys("ms",Keys.TAB);
        WebElement fromsta1 = driver.findElement(By.id("txtStationTo"));
        fromsta1.clear();
        fromsta1.sendKeys("mdu",Keys.TAB);
        
        
        List tableRow = (List) driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
        Dimension sizeRow = tableRow.size();
        System.out.println(sizeRow);
	}

}
