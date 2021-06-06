package com.automation.selenium.config;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private int timeOut ;


    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "chrome")
    public WebDriver chromeDriver(){
        //for the particular version
        //WebDriverManager.chromedriver().browserVersion("").setup();
        WebDriverManager.chromedriver().browserVersion("90.0.4430.212").setup();
        return new ChromeDriver();
    }
    @Bean
    @ConditionalOnProperty(name = "browser",havingValue = "firefox")
    //@Primary
    public WebDriver firefox(){
        //for the particular version
        //WebDriverManager.setup();
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    @Bean
    public WebDriverWait webDriverWait(WebDriver webDriver){

        return new WebDriverWait(webDriver,this.timeOut);
    }

}
