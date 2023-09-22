package in.debasish.Tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MvnRepo {
	
    WebDriver driver=new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	@Test(priority = 1)
	void logIn() {
		driver.get("https://mvnrepository.com/search?q=java%20fx&p=1");
		
	}
	
	@Test(priority = 2)
	void paginationNavigation() throws Exception {
		
	int	total_pages=driver.findElements(By.xpath("//ul[@class='search-nav']/li")).size();
	
	System.out.println(total_pages);
	
	for(int p=1;p<=9;p++) {
		
		WebElement active_Page=driver.findElement(By.xpath("(//ul[@class='search-nav']/li/span)[2]"));
		System.out.println("Active_Page: "+active_Page.getText());
		Thread.sleep(5000);
		
		String pageNo=Integer.toString(p+1);
		
		driver.findElement(By.xpath("//ul[@class='search-nav']//li//a[normalize-space()='"+pageNo+"']")).click();
		
	}
	}
	
	@Test(priority = 3)
	void Logout() {
		driver.close();
	}

}
