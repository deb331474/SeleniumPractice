package in.debasish.seleniumNotes;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateItems {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:/D:/SampleHtml/dropdown_Select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select se=new Select(dropdwn);
		
		List<WebElement> allOpt=se.getOptions();
		
		int count=allOpt.size();
		
		System.out.println("Printing the occurence of elements in the list=====================");
		
		HashMap<String, Integer> hashMapobj=new HashMap<String, Integer>();
		
		for(WebElement hs:allOpt) {
			
			String text=hs.getText();
			
			if(hashMapobj.containsKey(text)) {
				Integer value=hashMapobj.get(text);
				value++;
				hashMapobj.put(text, value);
			}
			else {
				hashMapobj.put(text, 1);
			}
		}
		
		Set<String> allKeys=hashMapobj.keySet();
		for(String key:allKeys) {
			Integer val=hashMapobj.get(key);
			val++;
			
			System.out.println(key +" -->"+ val);
			if(val>1) {
				System.out.println("Occurence of "+key+"is "+val);
			}
		}

	}

}
