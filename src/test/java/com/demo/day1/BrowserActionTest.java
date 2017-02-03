package com.demo.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
public class BrowserActionTest {
    WebDriver driver;

    @BeforeTest
    public void open() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    // @Test
    //  public void test1(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
    //       driver=new ChromeDriver();
    //      driver.get("http://www.baidu.com");
    //  }

    @Test
    public void test2() {
        driver.get("http://www.baidu.com");
        driver.get("http://www.hao123.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }


    @Test
    public void test3() throws InterruptedException {


        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);


    }

    @Test
    public void test5() {
        driver.get("https://www.baidu.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals("https://www.baidu.com/", url);
    }
    @Test
    public void getTitle(){
        driver.get("https://www.baidu.com");
        String title = driver.getTitle();
        System.out.println("百度首页url:"+title);
        Assert.assertEquals(title,"百度一下，你就知道");

    }


    @AfterMethod
    public void closedBrowser() {

        driver.quit();
    }
}




