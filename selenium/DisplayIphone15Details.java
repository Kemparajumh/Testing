import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DisplayIphone15Details {
        public static void main(String[] args) {

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");

            System.out.println("Amazon home page title: " + driver.getTitle());

            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iPhone 15");

            WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-index='0']//div[@class='a-section a-text-center']//span[@class='a-price']")));

            WebElement iphone15 = driver.findElement(By.xpath("//div[@data-index='0']//div[@class='a-section a-text-center']"));
            String price = iphone15.findElement(By.xpath(".//span[@class='a-price']")).getText();
            String details = iphone15.findElement(By.xpath(".//span[@class='a-size-medium']")).getText();

            System.out.println("Price of iPhone 15: " + price);
            System.out.println("Details of iPhone 15: " + details);
            // Close the browser
            driver.close();
        }
    }

