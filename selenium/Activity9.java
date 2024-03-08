package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(" https://v1.training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());//div[@id='ajax-content']/button

        driver.findElement(By.xpath("//div[@id='ajax-content']/button")).click();
        String hell0 = driver.findElement(By.xpath("//div[@id='ajax-content']/h1")).getText();
        System.out.println(hell0);                                                      //
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"ajax-content\"]/h3[contains(text(),I'm late!')]")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"ajax-content\"]/h3[contains(text(), \"I'm late!\")]")));

        String hell1 = driver.findElement(By.xpath("//div[@id=\"ajax-content\"]/h3")).getText();

        System.out.println(hell1);
//        driver.close();

    }
}
