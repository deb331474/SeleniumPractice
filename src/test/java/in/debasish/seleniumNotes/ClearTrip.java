package in.debasish.seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClearTrip {


    WebDriver driver;
    FirefoxOptions foo= new FirefoxOptions();

    @BeforeTest
    void AccessPage() {

        //foo.setCapability("disableGeolocation",true);
        driver=new FirefoxDriver(foo);
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    }
@Test
void disableGeolocation(){

        driver.findElement(By.xpath("(//div[@class='flex flex-middle p-relative homeCalender']//button)[1]")).click();

        driver.findElement(By.linkText("26")).click();
}

    @AfterTest
    void closeApp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
