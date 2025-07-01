package SeleniumBrushup;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Launchbrowser {
	WebDriver driver;
	//@Test
	public void launchBrowser() {
		driver = new EdgeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//aaa")));
		//ElementClickInterceptedException  when application changing one state to another  state so we get this exception so we need to wait 1 sec
		//NoSiuchElementException
		//Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				//.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	}
	//@Test
	public void handleAuthPOpup()
	{
		String username = "admin";
		String password = "admin";
		driver = new ChromeDriver();
		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		String text = driver.findElement(By.cssSelector("div#content>div>p")).getText();
		System.out.println(text);
		AssertJUnit.assertEquals(text, "Congratulations! You must have the proper credentials.");
		//driver.close();
		
	}
	//test ing
	//@Test
	public void handledropdown()
	{
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement droplist = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(droplist);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText()); //dropdown.getFirstSelectedOption().getText();
		
		//--------------------------------------------------------------------------------
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		System.out.println(list.size());
		for(WebElement option :list)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		

	}
	
	

}
