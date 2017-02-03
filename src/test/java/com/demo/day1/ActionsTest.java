package com.demo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class ActionsTest {
    WebDriver driver;

    @BeforeTest
    public void open() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void ClickTest(){
        driver.get("Http://www.baidu.com");
        WebElement element=driver.findElement(By.name("tj_trnuomi"));
        element.click();

    }
    @Test
    public void SendKeysTest(){
        driver.get("Http://www.baidu.com");
        WebElement element=driver.findElement(By.id("kw"));
        element.sendKeys("Webdriver");
      //  element.clear();
        element.click();
    }
    @Test
    public void GetText(){
        driver.get("Http://www.baidu.com");
        List<WebElement> WebElments=  driver.findElements(By.xpath(".//*[@id='u1']/a"));
        for (int i=0;i<WebElments.size();i++){
            String text =WebElments.get(i).getText();
            System.out.println(text);
        }


    }
    @AfterMethod
    public void closed () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
