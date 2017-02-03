package com.demo.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class ActiondTest {

    WebDriver driver;
    @BeforeMethod
    public void OpenChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\自动化精讲班\\webdriver2.53.1对应浏览器和driver\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public  void testContextClick() throws InterruptedException {
        driver.get("Http://www.baidu.com");

        WebElement BaiduButton=driver.findElement(By.id("su"));
        Actions actions=new Actions(driver);
        actions.contextClick(BaiduButton).perform();
        Thread.sleep(3000);
        actions.doubleClick(BaiduButton).perform();
    }
    @Test
    public void MoveToElement(){
        driver.get("http://www.baidu.com");
        WebElement element=driver.findElement(By.name("tj_briicon"));

        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();

    }
    @Test
    public void moveElemnet(){
        driver.get("C:\\Users\\Administrator\\Desktop\\自动化精讲班\\Selenium\\selenium_html\\selenium_html\\dragAndDrop.html");
        WebElement element=driver.findElement(By.id("drag"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,300,400).perform();

    }
    @Test
    public void elmentMoveToOtherElement(){
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/dragAndDrop.html");
        WebElement element1=driver.findElement(By.id("drag"));
        WebElement element2=driver.findElement(By.xpath("/html/body/h1"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(element1).moveToElement(element2).release(element1).perform();

    }
    @Test
    public void CheckboxTest(){
        driver.get("C:\\Users\\Administrator\\Desktop\\自动化精讲班\\Selenium\\selenium_html\\selenium_html\\index.html");
        WebElement element=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
        Actions actions=new Actions(driver);
        List<WebElement> list=element.findElements(By.tagName("option"));
        actions.keyDown(Keys.SHIFT)
                .click(list.get(0))
                .click(list.get(2)).perform();



    }
    @Test
    public void RobotTest() throws AWTException {
        driver.get("Http://www.baidu.com");

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);

    }
    @Test
    public  void UpLoadTest(){
        driver.get("file:///C:/Users/Administrator/Desktop/%E8%87%AA%E5%8A%A8%E5%8C%96%E7%B2%BE%E8%AE%B2%E7%8F%AD/Selenium/selenium_html/selenium_html/index.html");
        driver.findElement(By.id("load")).sendKeys("C:\\Users\\Administrator\\Desktop\\Automation Testing Engineer--Liu Wen ping");

    }

    @AfterMethod
    public void Closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

