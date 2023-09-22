package in.debasish.TestNgListener;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NopCommerceTests {
	
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testLogo()
	{
		try
		{
			boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
			AssertJUnit.assertEquals(status, true);
		}
		catch(NoSuchElementException e)
		{
			AssertJUnit.assertTrue(false);
		}
		
	}
	
	@Test(priority=2)
	void testLogin()
	{
		try
		{
			driver.findElement(By.linkText("Log in")).click(); //Login link
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc123@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test123");
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			Thread.sleep(3000);
			//validation
			boolean status=driver.findElement(By.linkText("My account")).isDisplayed();
			AssertJUnit.assertEquals(status, true); // this makes testmethod fail
		}
		catch(Exception e)
		{
			AssertJUnit.fail();  // Assert.assertTrue(false)
		}
		
		
	}
	
	@Test(priority=3,dependsOnMethods= {"testLogin"})
	void testLogout() throws InterruptedException
	{
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.linkText("Register")).isDisplayed();
		AssertJUnit.assertEquals(status,true);
	}
	
	
	@AfterMethod
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
