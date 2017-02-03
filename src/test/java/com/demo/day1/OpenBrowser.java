package com.demo.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/14 0014.
 */
public class OpenBrowser {
    WebDriver driver;


    @Test
    public void OpenFirefox(){
        driver= new FirefoxDriver();
    }
    @Test
    public void OpenFirefox2(){
       System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        driver=new FirefoxDriver();
    }
    @Test
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

           }

    @Test
    public void OpenIE(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
    }
    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(5000);
//        driver.close();
        driver.quit();
    }
}
