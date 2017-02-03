package com.demo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/25 0025.
 */
public class windowTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

    }
    @Test
    public void windowTest(){
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/index.html");
        driver.findElement(By.linkText("Open new window")).click();
        String handles1=driver.getWindowHandle();
        for (String handles :driver.getWindowHandles()){
            if (handles.equals(handles1)){
                continue;
            }
            driver.switchTo().window(handles);
        }
        driver.findElement(By.id("user")).sendKeys("new window");
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }




}
