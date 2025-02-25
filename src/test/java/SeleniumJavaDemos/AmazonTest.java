package SeleniumJavaDemos;
import org.testng.annotations.Test;

public class AmazonTest {

	@Test
	public static void main() {

		String browserName = "chrome";

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser(browserName);

		brUtil.launchURL("https://www.amazon.com");
		String actTitle = brUtil.getPageTitle();

		if (actTitle.contains("Amazon")) {
			System.out.println("title - pass");
		} else {
			System.out.println("title -- fail");
		}

		String url = brUtil.getPageURL();
		if (url.contains("amazon.com")) {
			System.out.println("url -- pass");
		} else {
			System.out.println("url -- fail");
		}

		//brUtil.closeBrowser();

	}

}
