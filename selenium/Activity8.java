package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get(" https://v1.training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//div[@class='spaced']/button")).click();
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='spaced']/button")));
        ele.click();

        //driver.findElement(By.xpath("//div[@class='spaced']/button")).click();

        driver.close();



    }
}
