package com.demo.day6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class EJS {


    @Test

    public void testEJS() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("Http://www.baidu.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById(\"kw\").setAttribute(\"value\",\"selenium\")");

        js.executeScript("console.log(\"这是一个控制台\")");
        Thread.sleep(4000);
        driver.quit();
    }

}
