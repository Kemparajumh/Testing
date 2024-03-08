import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity19 {

    public static <driver> void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://v1.training-support.net/selenium/javascript-alerts");

            String pageTitle = driver.getTitle();
            System.out.println("Page title: " + pageTitle);

            driver.findElement(By.id("confirm")).click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            driver.findElement(By.id("confirm")).click();
            wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Latest tab title: " + driver.getTitle());
        driver heading = (driver) driver.findElement(By.tagName("h1"));
        System.out.println("Latest tab heading: " + heading.getClass());

    }

}
