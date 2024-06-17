package SeleniumJavaDemos;

import java.util.List;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownScrolling extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://www.hirist.tech/");

		driver.findElement(By.xpath("//div[text()='Location']")).click();

		List<WebElement> locList = driver.findElements(By.cssSelector("label.location-checkbox"));

		for (WebElement e : locList) {
			System.out.println(e.getText());
			if (e.getText().contains("Tanzania")) {
				e.click();
				break;
			}
		}

	}

}
