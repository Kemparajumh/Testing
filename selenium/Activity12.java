import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        try {
            // Open the URL
            driver.get("https://v1.training-support.net/selenium/dynamic-controls");

            // Print the title of the page
            System.out.println("Page title: " + driver.getTitle());

            // Find the text field
            WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));

            // Check if the text field is enabled and print it
            System.out.println("Is the text field enabled? " + textField.isEnabled());

            // Click the "Enable Input" button to enable the text field
            driver.findElement(By.id("toggleInput")).click();

            // Wait until the text field is enabled
            wait.until(ExpectedConditions.elementToBeClickable(textField));

            // Check if the text field is enabled now and print it
            System.out.println("Is the text field enabled now? " + textField.isEnabled());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
