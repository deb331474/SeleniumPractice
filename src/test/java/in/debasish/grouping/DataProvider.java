package in.debasish.grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class DataProvider {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(dataProvider="dp")
	void TestLogin(String email, String pwd) throws InterruptedException {
		WebElement username=driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys(email);
	    WebElement	password=driver.findElement(By.id("Password"));
	    password.clear();
	    password.sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
		
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@org.testng.annotations.DataProvider(name = "dp")
	String [][] loginData(){
	
	String data[][]= {  
			{ "nathanestle@gmail.com", "test123" }, //valid
			{ "pavanol@gmail.com", "test@123" },//valid
			{ "pavanoltraining@gmail.com", "test3" },//valid
			{ "pavanoltraining@gmail.com", "test@123" },
			{ "pavanoltraining@gmail.com", "test@123" } 
		};
	return data;
	}

}
