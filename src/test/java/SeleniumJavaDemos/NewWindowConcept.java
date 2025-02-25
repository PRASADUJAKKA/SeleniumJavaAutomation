package SeleniumJavaDemos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept extends BaseTest {

	@Test
	public static void main() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		String pWID = driver.getWindowHandle();
		
		//selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());//google

		driver.close();//close google tab
		
		driver.switchTo().window(pWID);
		
		System.out.println(driver.getTitle());//orange hrm
		
		
	}

}
