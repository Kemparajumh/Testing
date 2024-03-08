import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

            // Get the title of the page and print it
            System.out.println("Page title: " + driver.getTitle());

            WebElement username = driver.findElement(By.xpath("//input[contains(@class, 'username')]"));
            WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));

            username.sendKeys("admin");
            password.sendKeys("password");

            driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

            WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
            System.out.println("Login message: " + loginMessage.getText());

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
