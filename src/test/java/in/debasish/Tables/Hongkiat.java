package in.debasish.Tables;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.Current;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class Hongkiat {


	WebDriver driver;

    @BeforeClass
    void setUp() {
    	ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("chrome.switches", "--disable-extensions");
		opt.addArguments("user-data-dir=C:\\Users\\Debasish\\OneDrive\\Desktop\\Debasish - Chrome.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(opt);

        driver.get("https://www.hongkiat.com/blog/technology/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();
        
        
    }
	@Test(priority = 1)
	void paginationNavigation() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement current_page = driver.findElement(By.xpath("//span[@class='page-numbers current']"));

		WebElement nextButton = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space()='Next']")));

		String next_btn_class = nextButton.getAttribute("class");

		System.out.println(next_btn_class);

		while (!next_btn_class.contains("next")) {
			break;
		}
		

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView();", current_page);
		System.out.println(current_page.getText());
		Thread.sleep(10000);
		jsExecutor.executeScript("arguments[0].scrollIntoView();", nextButton);
		nextButton.click();
	}

}
