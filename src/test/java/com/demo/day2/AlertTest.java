package com.demo.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/24 0024.
 */
public class AlertTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

    }
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"alert\"]/input")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void confirmTest() throws InterruptedException {
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"confirm\"]/input")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(3000);
        alert.accept();
    }
    @Test
    public void promptTest() throws InterruptedException {
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/index.html");
        driver.findElement(By.xpath("//*[@id=\"prompt\"]/input")).click();
        Thread.sleep(3000);
        Alert prompt=driver.switchTo().alert();


        prompt.sendKeys("这是个prompt");
        prompt.accept();
        Thread.sleep(3000);
        prompt.accept();
    }
    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
