package SeleniumJavaDemos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement extends BaseTest{

	@Test
	public static void main() throws InterruptedException {
		driver.get("chrome://settings/");
		Thread.sleep(3000);
		
		
		String search_script = 
				"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search = (WebElement)js.executeScript(search_script);

		search.sendKeys("notifications");
		//driver.findElement(By.id("searchInput")).sendKeys("notifications");

	}

}
