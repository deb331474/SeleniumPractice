package in.debasish.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithLcator_Day1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		
		driver.close();
	}

}
