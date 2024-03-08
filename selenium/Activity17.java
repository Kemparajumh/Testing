import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement singleSelect = driver.findElement(By.id("single-select"));

        Select select = new Select(singleSelect);
        select.selectByVisibleText("Option 2");

        select.selectByIndex(2);

        select.selectByValue("4");

        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println("Option value: " + option.getAttribute("value") + ", Option text: " + option.getText());
        }

        // Close the browser
        driver.quit();
    }
}