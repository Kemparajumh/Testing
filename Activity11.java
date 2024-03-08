import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        try {
            // Open the specified URL
            driver.get("https://v1.training-support.net/selenium/dynamic-controls");

            // Get the title of the page and print it
            System.out.println("Page title: " + driver.getTitle());

            // Find the checkbox input element
            WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

            // Check if the checkbox is selected and print the result
            System.out.println("Is the checkbox selected? " + checkbox.isSelected());

            // Click the checkbox to select it
            checkbox.click();

            // Check if the checkbox is selected now and print the result
            System.out.println("Is the checkbox selected now? " + checkbox.isSelected());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
