package in.debasish.seleniumNotes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:/D:/SampleHtml/dropdown_Select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select se=new Select(dropdwn);
		
		//se.getFirstSelectedOption();
		
		//se.selectByIndex(10);
		
		List<WebElement> allOpt=se.getOptions();
		
		int size=allOpt.size();
		
		System.out.println("The total number of options inside the dropdowns are "+size);
		
		for(WebElement ws:allOpt) {
			String text=ws.getText();
			System.out.println(text);
		}
		
		

	}

}
