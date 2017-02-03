package com.demo.day2;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
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
    @Test
    public void tagNameTest(){
        driver.get("Http://www.baidu.com");
        WebElement elemnt=driver.findElement(By.id("kw"));
        String tagName=elemnt.getTagName();
        System.out.println(tagName);
        Assert.assertEquals(tagName,"input");

    }
    @Test
    public void getA(){
        driver.get("Http://www.baidu.com");
        WebElement elemnt=driver.findElement(By.id("kw"));
        String att=elemnt.getAttribute("maxlength");
        Assert.assertEquals(att,"255");

    }
    @Test
    public void IsDisplayed(){
        driver.get("Http://www.baidu.com");
       Boolean B=driver.findElement(By.id("su")).isDisplayed();
       Assert.assertTrue(B);
    }
    @Test
    public void isSelected(){
        driver.get("C:\\Users\\Administrator\\Desktop\\自动化精讲班\\Selenium\\selenium_html\\selenium_html\\index.html");
        Boolean b=driver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]")).isSelected();
        Assert.assertFalse(b);
    }
    @Test
    public void isSelected2(){
        driver.get("C:\\Users\\Administrator\\Desktop\\自动化精讲班\\Selenium\\selenium_html\\selenium_html\\index.html");
        WebElement element=driver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]"));
        element.click();
        boolean b=element.isSelected();
        Assert.assertTrue(b);
    }
    @Test
    public void isEnbled(){
        driver.get("C:\\Users\\Administrator\\Desktop\\自动化精讲班\\Selenium\\selenium_html\\selenium_html\\index.html");
        boolean b = driver.findElement(By.name("buttonhtml")).isEnabled();
        System.out.println(b);
        Assert.assertFalse(b);


    }
    @Test
    public void screenShotTest()  {
        driver.get("Http://www.baidu.com");
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file,new File("D://test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @AfterMethod
    public void closed () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
