package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallalTestng {

	WebDriver driver = null;

	@Test
	public void Test1() throws InterruptedException {	 
		
		System.out.println("I am inside Test1"+Thread.currentThread().getId());
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumComponents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void Test2() throws InterruptedException {
		
		System.out.println("I am inside Test1"+Thread.currentThread().getId());
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumComponents\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("I am inside Test2"+Thread.currentThread().getId());
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.close();


	}
}
