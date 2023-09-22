package in.debasish.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WthoutSelectAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//span[@class='multiselect-native-select']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
		
		System.out.println("Total number of Options" + options.size());
		
		/*
		 * StringBuilder concatenatedText=new StringBuilder();
		 * 
		 * for(WebElement opt:options) {
		 * concatenatedText.append(opt.getText()).append(" "); }
		 * 
		 * String allitems=concatenatedText.toString().trim();
		 * 
		 * System.out.print(allitems);
		 */
		
		Thread.sleep(3000);
		
		/*
		 * for(int i=0;i<options.size();i++) {
		 * 
		 * String option=options.get(i).getText(); if(option.equals("Java") ||
		 * option.equals("Python")) { options.get(i).click(); } }
		 */
		
		for(WebElement opt:options) {
			String test=opt.getText();
			
			if(test.equals("Python") || test.equals("HTML")) {
			  opt.click();

			 }
		}
		driver.close();
		
	}

}
