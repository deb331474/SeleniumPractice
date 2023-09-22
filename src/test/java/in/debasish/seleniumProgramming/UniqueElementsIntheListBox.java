package in.debasish.seleniumProgramming;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UniqueElementsIntheListBox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:/D:/SampleHtml/dropdown_Select.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select si=new Select(dropdwn);
		
		List<WebElement> allOpt=si.getOptions();
		
		int count=allOpt.size();
		
	    System.out.println("Printing unique elements in the list box==================");
	    
	    HashSet<String> allElements=new HashSet<String>();
	    
	    for(WebElement option:allOpt) {
	    	String text=option.getText();
	    	System.out.println(text);
	    	allElements.add(text);
	    }
	    
	    System.out.println(allElements);

	}

}
