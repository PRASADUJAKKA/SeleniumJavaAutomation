package SeleniumJavaDemos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class WebDriverBasics extends BaseTest {

	@Test
	public static void main() {

		// open browser: chrome
		// enter url
		// get the title
		// verify the title - act vs exp

		// automation steps
		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle();// get title
		System.out.println("page title: " + title);

		// checkpoint/verification point/act vs exp:
		if (title.equals("Google")) {
			System.out.println("correct title -- PASS");
		} else {
			System.out.println("incorrect title -- FAIL");
		}

		// automation steps + verification point ---> Automation Testing
		// test steps + verification point -- test case

		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("google.com")) {
			System.out.println("url -- PASSED");
		} else {
			System.out.println("url -- failed");
		}

		// close the browser:quit() and close()
		driver.close();

	}

}
