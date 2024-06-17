package SeleniumJavaDemos;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp extends BaseTest {

	@Test
	public static void main() throws InterruptedException {
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//type = file is mandatory
		
		//c:\\document\\test.txt
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\prasa\\Downloads\\General-Store.apk");
		Thread.sleep(10000);
	
		//sikuli - image based/resolution based
		//autoIT -- only for windows machine -- wont work in docker, headless, jenkins, linux, macos
		
		
	}

}
