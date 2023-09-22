package in.debasish.seleniumProgramming;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OccurenceofWords {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\SampleHtml_Practice\\dropdown_Select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select si=new Select(dropdwn);
		
		List<WebElement> allOpt=si.getOptions();
		
		int count=allOpt.size();
	
		HashMap<String, Integer> hashMapObj=new HashMap<String, Integer>();
		
		for(WebElement ws:allOpt) {
			String text=ws.getText();
			if(hashMapObj.containsKey(text)) {
				Integer val=hashMapObj.get(text);
				val++;
				hashMapObj.put(text, val);
			}
			else {
				hashMapObj.put(text, 1);
			}
		}
		
		Set<String> allkeys=hashMapObj.keySet();
		for(String key:allkeys) {
			Integer value=hashMapObj.get(key);
			if(value>1) {
				System.out.println("Occurence of "+key+" is"+value);
			}
		}
	}
}
