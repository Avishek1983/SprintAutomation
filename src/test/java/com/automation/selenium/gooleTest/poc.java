package com.automation.selenium.gooleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class poc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","/Users/avishek/Desktop/JavaCode/selenium/src/main/resources/Driver/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("hhtps://www.google.com");
        webDriver.close();
    }
}
