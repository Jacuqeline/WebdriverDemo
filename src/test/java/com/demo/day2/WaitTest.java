package com.demo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/25 0025.
 */
public class WaitTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

    }
    @Test
    public void waitTest(){
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"display\"]/div[1]")));
       String text= driver.findElement(By.xpath("//*[@id=\"display\"]/div[1]")).getText();
        Assert.assertEquals(text,"wait for display");


    }
    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
