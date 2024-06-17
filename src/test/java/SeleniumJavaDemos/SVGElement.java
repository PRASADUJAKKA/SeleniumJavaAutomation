package SeleniumJavaDemos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement extends BaseTest {

	@Test
	public static void main() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("macbook");
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();

	}

}
