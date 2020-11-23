import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class FirstTestCase {

    public static void main(String args[]) throws InterruptedException {
        // Define URL of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        // Define Selenium WebDriver
        WebDriver webDriver = new ChromeDriver();
        // Open Chrome browser

        //----------------------------------------------------------------------------------------------------------------
//        webDriver.get("https://demoqa.com/automation-practice-form");
//
//        WebDriverWait wait = new WebDriverWait(webDriver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstName']"))).sendKeys("Phuong Ngon");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='lastName']"))).sendKeys("Phan");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userEmail']"))).sendKeys("andy@gmail.com");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//div[@id='userNumber-wrapper']//input[@id='userNumber']"))).sendKeys("123-123-123");
//        Thread.sleep(3000);

        //----------------------------------------------------------------------------------------------------------------

        webDriver.get("https://www.calculator.net/bmi-calculator.html   ");
        // Expand web browser
//        webDriver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(webDriver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Metric Units']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cage']"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='cage']"))).sendKeys("35");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='csex2']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cheightmeter']"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cheightmeter']"))).sendKeys("170");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ckg']"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ckg']"))).sendKeys("65");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Calculate']"))).click();

        String bmiResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".rightresult .bigtext"))).getText();
        System.out.println(bmiResult);

        // This is test for branch bla...bla...bla....

        // Quit Chrome
        webDriver.quit();
    }
}
