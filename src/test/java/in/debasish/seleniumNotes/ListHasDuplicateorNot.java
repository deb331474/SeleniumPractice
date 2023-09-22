package in.debasish.seleniumNotes;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListHasDuplicateorNot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:/D:/SampleHtml/dropdown_Select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select se=new Select(dropdwn);
		
		List<WebElement> allOpt=se.getOptions();
		
		
		
		int count=allOpt.size();
		
		System.out.println("No of elements in the list "+count);
		
		HashSet<String> hs=new HashSet<String>();
		
		
		for(WebElement ws:allOpt) {
			String val=ws.getText();
			
			//System.out.println(val);
			
			hs.add(val);
		}
		System.out.println(hs);
		
		int count2=hs.size();
		
		System.out.println("No of Elements in the Hash Set is "+count2);
		
		if(count==count2) {
			System.out.println("List has No Duplicates");
		}
		else
			System.out.println("List has duplicates");
		
	}
	


}
