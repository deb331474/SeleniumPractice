package in.debasish.CompleteProjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Tooltip {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	}
	
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	

}
