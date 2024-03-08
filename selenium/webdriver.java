import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class webdriver {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        System.out.println("Page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        System.out.println("Is the checkbox visible? " + checkbox.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));


        boolean isCheckboxVisibleAfter = false;
        try {
            isCheckboxVisibleAfter = driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
        } catch (Exception e) {

            isCheckboxVisibleAfter = false;
        }

        System.out.println("Is the checkbox visible after clicking the button? " + isCheckboxVisibleAfter);

        // Close the browser
        driver.quit();
    }
}
