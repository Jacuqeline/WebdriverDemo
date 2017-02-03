package com.demo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class FindElementTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
    }
    @Test
    public void testByID(){
        driver.get("Http://www.baidu.com");
        WebElement Element=driver.findElement(By.id("kw"));
        System.out.println(Element);


    }
    @Test
    public void testByName(){
        driver.get("Http://www.baidu.com");
        WebElement Element=driver.findElement(By.name("wd"));
        System.out.println(Element);


    }
    @Test
    public void testByClassName(){
        driver.get("Http://www.baidu.com");
        WebElement Element=driver.findElement(By.className("s_ipt"));
        System.out.println(Element);


    }
    @Test
    public void testByTextLink(){
        driver.get("Http://www.baidu.com");
        WebElement Element=driver.findElement(By.linkText("糯米"));
        System.out.println(Element);


    }
    @Test
    public void testByXpath(){
        driver.get("Http://www.baidu.com");
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("WebDriver");



    }
    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }


}
