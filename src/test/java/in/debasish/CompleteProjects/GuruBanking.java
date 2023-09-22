package in.debasish.CompleteProjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import in.debasish.pom.LoginPage2;

public class GuruBanking {
	
	

	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	}
	
	@Test
	void Login() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr522529");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ybEgAvE");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String welcome=driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
		
		Assert.assertEquals(welcome, "Welcome To Manager's Page of GTPL Bank");
	}
	@Test(dependsOnMethods = {"Login"})
	void AddNewCustomer() throws InterruptedException {
		
		  driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
		  
		  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("debasish");
		  driver.findElement(By.xpath("(//input[@name='rad1'])[1]")).click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("24-05-1994");
		  
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("sfhjkshfsdjkhfnksjdf");
		  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Sambalpur");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Odisha");
		  driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("123457");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("12345563214");
		  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abc@gmail.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='sub']")).click();
		 
		   
		  
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	

}
