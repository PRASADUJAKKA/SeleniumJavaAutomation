package SeleniumJavaDemos;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling extends BaseTest {

	@Test
	public static void main() throws InterruptedException {

		// frame: webelement : DOM

		// Browser
		// --Page : webelement
		// --Frame: webelement

		// frame vs iframe

		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

	}

}
