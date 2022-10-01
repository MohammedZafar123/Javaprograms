package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/s?k=bags+for+men&crid=17LL0LY5Y7LAQ&sprefix=bags%2Caps%2C308&ref=nb_sb_ss_softlines-tsdoa-joint-contextual-iss_1_4");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(null)))

}
}
