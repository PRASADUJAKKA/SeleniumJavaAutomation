package SeleniumJavaDemos;

import java.util.List;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages extends BaseTest {

	@Test
	public static void main() {

		driver.get("https://www.amazon.com/");

		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("total images = " + imagesList.size());

		for (WebElement e : imagesList) {
			String altValue = e.getAttribute("alt");
			String srcValue = e.getAttribute("src");

			System.out.println(altValue + "  ----  " + srcValue);
		}

	}

}
