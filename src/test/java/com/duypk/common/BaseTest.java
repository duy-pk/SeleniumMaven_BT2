package com.duypk.common;

import com.duypk.locator.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public static String categoryName = "Banh Trung Thu 2024";

    //Khoi tao browser
    @BeforeMethod
    @Parameters({"browserName"})
    public static void createBrowser(@Optional("Chrome") String browser){

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

        //dang nhap tai khoan
        driver.get(LocatorCMS.cmsURL);
        driver.findElement(By.xpath(LocatorCMS.loginInputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCMS.loginInputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCMS.loginLoginButton)).click();
    }

    //Dong browser
    @AfterMethod
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
