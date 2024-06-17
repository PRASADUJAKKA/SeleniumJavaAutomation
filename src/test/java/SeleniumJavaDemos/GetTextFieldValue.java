package SeleniumJavaDemos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextFieldValue extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");

		String emailid = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(emailid);

//		String email = driver.findElement(By.id("input-email")).getText();
//		System.out.println(email);
//		getText: link, header, label, span, 

	}

}
