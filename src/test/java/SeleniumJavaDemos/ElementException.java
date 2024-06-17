package SeleniumJavaDemos;

import java.util.List;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		//driver.findElement(By.name("search111")).sendKeys("macbook");
		//NoSuchElementException
		
		
		List<WebElement> eles = driver.findElements(By.tagName("naveen"));
		//Empty array list
		System.out.println(eles.size());//0
		System.out.println(eles);//[]
		
		
		
	}

}
