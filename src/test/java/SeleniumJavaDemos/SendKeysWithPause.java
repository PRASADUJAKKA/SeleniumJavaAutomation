package SeleniumJavaDemos;

import java.time.Duration;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		WebElement search = driver.findElement(By.name("search"));
		
		String value = "macbook";
		
		char val[] = value.toCharArray();
		
		for(char c : val) {
			act.sendKeys(search, String.valueOf(c)).pause(500).build().perform();

		}
		
		
		
	}

}
