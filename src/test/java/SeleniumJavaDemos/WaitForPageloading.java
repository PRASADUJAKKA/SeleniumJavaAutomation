package SeleniumJavaDemos;

import java.time.Duration;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageloading extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://classic.crmpro.com/");

		boolean flag = isPageLoaded(10);
		if (!flag) {
			throw new BrowserException("PAGE IS NOT LOADED");
		}
	}

	public static boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"))
				.toString();// "true"
		return Boolean.parseBoolean(flag);// true
	}

}
