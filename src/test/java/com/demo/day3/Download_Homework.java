package com.demo.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class Download_Homework {
    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
        System.setProperty("webdrover.chrome.driver","C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void DownloadTest() throws InterruptedException, AWTException {
        driver.get("https://pan.baidu.com/disk/home?errno=0&errmsg=Auth%20Login%20Sucess&stoken=58dfb6de8331410802469aa234e2297d35252607287c34622dc51ab0951578fbe25df74cb6564fc079261e724cd52ba74d5e231b33e66e5412a99d918fbe89fd341aa7a56a88&bduss=0529e107636570390b0c6565c7438dc63658b23e8fd2d9778e75b402aba24ed70c6ee2f139ad63cf89b4817033754d5ea8033dfdad2acb5e296d4bb92d1e8cc94bb2c47b5165df44107e83417d686789e962064eb5bd4cc434bd379db38947e3cd02d03f015e198e84772d71b21c430c9ab3f229d65d3b93898c8604a7a118296f615171bf8a57eca49948ae150eceff66a908a68f9a063b7f4be689810a4e8d924b2528046eef8d908c64c15b5c65583d631069906ed61755c511f0d98790995304531a8ed5&ssnerror=0#list/path=%2F&vmode=list");
        WebElement element=driver.findElement(By.xpath("//*[@id=\"layoutMain\"]/div[2]/div[3]/div/div/dd[47]/div[2]/div[1]"));
        element.click();
        WebElement element1=driver.findElement(By.xpath("//*[@id=\"layoutMain\"]/div[1]/div[2]/div[4]/div[4]/a[3]/span/span"));
        element1.click();
        Thread.sleep(5000);
        Robot robot=new Robot();
        Robot robot1=new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
          }


    @AfterMethod
    public void Closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
