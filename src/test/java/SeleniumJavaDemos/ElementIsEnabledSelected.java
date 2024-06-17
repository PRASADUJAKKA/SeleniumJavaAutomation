package SeleniumJavaDemos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected extends BaseTest {

	@Test
	public static void main() throws InterruptedException {
		driver.get("https://classic.freecrm.com");	
		Thread.sleep(10000);
		
		//isDiplayed -- element is present on the page
		//isEnabled -- element is obv present on the page but its enabled or not
		
		boolean f1 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).isDisplayed();
		System.out.println(f1);
		boolean f2 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).isDisplayed();
		System.out.println(f2);
		
		
		boolean flag = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).isEnabled();
		System.out.println(flag);//false
		
		
		boolean chk_flag = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).isSelected();
		System.out.println(chk_flag);//false
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).click();//select the checkbox
		
		chk_flag = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).isSelected();
		System.out.println(chk_flag);//true
		
		
		flag = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).isEnabled();
		System.out.println(flag);//true
		
				
	}

}
