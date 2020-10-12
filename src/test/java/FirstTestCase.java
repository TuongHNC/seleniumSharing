import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String args[]) throws InterruptedException {
        // Define URL of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        // Define Selenium WebDriver
        WebDriver webDriver = new ChromeDriver();
        // Open Chrome browser
        webDriver.get("https://demoqa.com/login");

        Thread.sleep(3000);
        // Find by UserName text field
        webDriver.findElement(By.xpath("//input[@id='userName']")).sendKeys("testuser");
        Thread.sleep(3000);
        // Find by Password text field
        webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password@123");
        Thread.sleep(3000);
        // Find by Login button
        webDriver.findElement(By.xpath("//button[@id='login']")).click();
        Thread.sleep(4000);

        // Quit Chrome
        webDriver.quit();
    }
}
