package com.duypk.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public static String categoryName = "Banh Trung Thu 2023";

    //Khoi tao browser
    public static void createBrowser(String browser){

        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        }
        if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        if (browser.equals("Egde")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //Dong browser
    public static void closeBroser(){
        sleep(2);
        driver.quit();
    }

    //Doi cho chu dong
    public static void sleep(double second){
        try {
            Thread.sleep((long) second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
