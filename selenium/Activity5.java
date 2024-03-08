package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://v1.training-support.net/selenium/input-events");

        String title = driver.getTitle();
        System.out.println(title);
        Actions actions = new Actions(driver);
        WebElement cl = driver.findElement(By.xpath("//div[contains(text(),'No Key Pressed')]"));
        actions.click(cl).perform();


    }
}
