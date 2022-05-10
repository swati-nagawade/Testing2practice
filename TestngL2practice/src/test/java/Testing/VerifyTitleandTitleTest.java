package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandTitleTest{
  @Test
  public void titleTest()throws InterruptedException
  {
	String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	String excepted = "Search";
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 String actualtitle = driver.getTitle();
	 Assert.assertEquals(actualtitle, expectedtitle,"Text verification failed");
	 String actualtext = driver.findElement(By.xpath("//*[@gh-btn]")).getAttribute("value");
	 Assert.assertEquals(actualtitle, expectedtitle,"Text verification failed");
	 
	 driver.close();
}
}

