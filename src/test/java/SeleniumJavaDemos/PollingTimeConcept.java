package SeleniumJavaDemos;

import java.time.Duration;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
public class PollingTimeConcept extends BaseTest {

	@Test
	public static void main() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		By twitter = By.xpath("//a[contains(@href, 'twitter11')]");
		
		//This will fail due to element not found exception
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//interval time = 500 ms
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2), Duration.ofSeconds(5));//interval time = 2000 ms/2 secs

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(twitter)).click();
//		
//	

		     

	

	}

}

