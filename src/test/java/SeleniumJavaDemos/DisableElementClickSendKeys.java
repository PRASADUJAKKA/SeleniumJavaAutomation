package SeleniumJavaDemos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");	
		
		
		
//		driver.findElement(By.id("pass")).click();//no exception
//		
//		driver.findElement(By.id("pass")).sendKeys("testing");
		//ElementNotInteractableException: element not interactable
		
		
		//driver.findElement(By.id("fname")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		
		StringBuilder sb = new StringBuilder("testing");
		String s = "automation";
		
		driver.findElement(By.id("fname")).sendKeys(sb, s, "naveen");
		
		//CharSequence -- interface
		//string, SBuilder, SBuffer
		
		
		
			
	}

}
