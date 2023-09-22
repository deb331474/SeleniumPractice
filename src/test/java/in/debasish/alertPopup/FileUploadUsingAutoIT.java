package in.debasish.alertPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FileUploadUsingAutoIT {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);

        WebElement fileInput = driver.findElement(By.xpath("//input[@multiple='']"));
        fileInput.sendKeys("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\testData\\data.xlsx");

        // Click the upload button
        WebElement uploadButton = driver.findElement(By.xpath("//button[@ng-click='uploader.uploadAll()']"));
        uploadButton.click();

        driver.close();
    }
}
