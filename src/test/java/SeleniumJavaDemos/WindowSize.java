package SeleniumJavaDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowSize extends BaseTest {

	@Test
	public static void main() {
		driver.close();
		WebDriver driver2 = new EdgeDriver();

		// driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		// responsive - view port -
		Dimension dim = new Dimension(414, 896);
		driver2.manage().window().setSize(dim);

		driver2.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// sel 4.x
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();

		WebElement fn = driver2.findElement(By.id("input-firstname"));
		System.out.println(fn.getCssValue("font-size"));

		int ht = fn.getSize().getHeight();
		int wd = fn.getSize().getWidth();
		System.out.println(ht);
		System.out.println(wd);

		int x = fn.getLocation().getX();
		int y = fn.getLocation().getY();

		System.out.println(x + " " + y);

		WebElement continue_btn = driver2.findElement(By.xpath("//input[@value='Continue']"));
		String bk_color = continue_btn.getCssValue("background-color");
		System.out.println(bk_color);

	}

}
