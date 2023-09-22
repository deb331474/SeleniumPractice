package in.debasish.seleniumNotes;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OccurenceOfWord {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:/D:/SampleHtml/dropdown_Select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select se=new Select(dropdwn);
		
		List<WebElement> allOpt=se.getOptions();
		
		int count=allOpt.size();
		
		System.out.println("Printing the duplicate elements in the list=====================");
		
		HashSet<String> allElements=new HashSet<String>();
		
		for(int i=0;i<count;i++) {
			String text=allOpt.get(i).getText();
			if(!allElements.add(text)) {
				System.out.println(text+" is the duplicate items in the list");
			}
		}
		System.out.println(allElements.size());
		
		System.out.println(allElements);

	}

}
