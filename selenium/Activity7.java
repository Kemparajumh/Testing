package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get(" https://v1.training-support.net/selenium/drag-drop");
        Actions actions = new Actions(driver);
        System.out.println(driver.getTitle());
        WebElement ele1 = driver.findElement(By.id("draggable"));
        WebElement ele2 = driver.findElement(By.id("droppable"));
        WebElement ele3 = driver.findElement(By.id("dropzone2"));
        actions.dragAndDrop(ele1,ele2).perform();
        actions.dragAndDrop(ele1,ele3).perform();
        String res1 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        String res2 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        System.out.println(res1);
        if(res1.equals("Dropped!")) {
            System.out.println("Dropped in 1");
        }
        if(res2.equals("Dropped!")){
            System.out.println("Dropped in 2");
        }
        driver.close();
    }
}
