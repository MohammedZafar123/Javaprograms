package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
			
		//get text
		String text =driver.findElement(By.tagName("h2")).getText();
		//print the tag name
		System.out.println(text);
		//verify by title
		String title=driver.getTitle();//cntrl+2+l//leaftaps-testleaf automation platform
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Creat Lead")).click();
		driver.findElement(By.id("creat lead form_companyName")).sendKeys("Test leaf");
		driver.findElement(By.id("creat lead form_firstName")).sendKeys("Khatijatul");
		driver.findElement(By.id("creat lead form_lastName")).sendKeys("Zafar");
		driver.findElement(By.name("departmentName")).sendKeys("Environmental Engineering");
		driver.findElement(By.name("discription")).sendKeys("Zafar completed the assignment");
		driver.findElement(By.id("creatLeadForm-primary email")).sendKeys("jafar.maverick@gamil.com");
		driver.findElement(By.className("smallsubmit")).click();
driver.findElement(By.linkText("Duplicate button")).click();
driver.findElement(By.id("creatlaeadform_comoany Name")).clear();
driver.findElement(By.id("Enter new company Name")).sendKeys("Straive");
driver.findElement(By.id("creat lead form_firstName")).clear();
driver.findElement(By.id("enter new name")).sendKeys("Zafar");
driver.findElement(By.className("smallsubmit")).click();
String title2=driver.getTitle();
System.out.println(title2);


	
	}

}
