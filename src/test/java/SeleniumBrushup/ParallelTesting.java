package SeleniumBrushup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@BeforeTest
	@Parameters("BrowserName")
	public void launchingBrowsers(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		if(browserName.equals("safari"))
		{
			driver = new SafariDriver();
		}
	}
	
	@Test
	public void HandleActionclass()
	{
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_ya_signin']/span"))).build().perform();
		
		
	}
	
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}

}
