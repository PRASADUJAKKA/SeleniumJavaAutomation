package SeleniumJavaDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertJsPopUpHandling extends BaseTest {

	@Test
	public static void main() throws InterruptedException {

		// alert
		// prompt
		// confirm
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//1. alert:
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();//click ok 
		
		//alert.dismiss();//cancel alert
		
		//2. confirm:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();//click ok
		
		//3. prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(5000);
		alert.sendKeys("naveen");
		Thread.sleep(5000);
		alert.accept();//click ok


	}

}
