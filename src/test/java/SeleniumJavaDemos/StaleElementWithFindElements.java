package SeleniumJavaDemos;

import java.util.List;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementWithFindElements extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");// v1

		List<WebElement> footerList = driver.findElements(By.cssSelector("footer a"));// v1

		for (int i = 0; i < footerList.size(); i++) {
			footerList.get(i).click();// v2
			driver.navigate().back();// v3
			footerList = driver.findElements(By.cssSelector("footer a"));
		}

//		for(WebElement e : footerList) {
//			e.click();
//			driver.navigate().back();
//			footerList = driver.findElements(By.cssSelector("footer a"));
//		}

	}

}
