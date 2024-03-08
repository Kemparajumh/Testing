package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver dri = new FirefoxDriver();

        dri.get("https://v1.training-support.net");

    }
}