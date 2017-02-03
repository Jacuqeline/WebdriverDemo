package com.demo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/23 0023.
 */
public class SelectTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
    }
    @Test
    public void selectByIndex() throws InterruptedException {
        driver.get("C:\\Users\\Administrator\\Desktop\\自动化精讲班\\Selenium\\selenium_html\\selenium_html\\index.html");
        WebElement selectElement=driver.findElement(By.id("moreSelect"));
        Select select=new Select(selectElement);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByValue("huawei");
        Thread.sleep(3000);
        select.selectByVisibleText("xiaomi");
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }






    }



