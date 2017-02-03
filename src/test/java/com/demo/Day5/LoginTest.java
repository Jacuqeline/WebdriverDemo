package com.demo.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter;

import java.awt.*;
import java.awt.event.KeyEvent;

@Test
/**
 * Created by Administrator on 2017/1/2 0002.
 */
public class LoginTest extends BaseCase {
    //登录邮箱
    public void LoginSucess() {
        driver.get("http://mail.163.com");
        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys("meyoungtester");
        driver.findElement(By.name("password")).sendKeys("meyoung123");
        driver.findElement(By.id("dologin")).click();
        //进入邮箱页面，校验
        boolean b = driver.findElement(By.linkText("退出")).isDisplayed();
        Assert.assertTrue(b);
        String name = driver.findElement(By.xpath("//*[@id=\"1483343754288_dvGreetName\"]")).getText();
        Assert.assertEquals(name, "meyoungtester");
    }

    LoginTest loginTest=new LoginTest();
    @Test
    public void LoginFail() {
        driver.get("http://mail.163.com");
//        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys("meyoungtester");
        driver.findElement(By.name("password")).sendKeys("meyoung1233");
//        driver.findElement(By.id("dologin")).click();

    //    loginTest.Login(Email:"meyoungtester",PWD:"meyoung1233");
        String msg = driver.findElement(By.xpath("//*[@id=\"auto-id-1483443790590\"]")).getText();
        Assert.assertEquals(msg, "帐号或密码错误");


    }
    @Test
    public void Login(String Email,String PWD){
        driver.get("http://mail.163.com");
        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(PWD);
        driver.findElement(By.id("dologin")).click();

    }


//发送带附件的邮件
    @Test
    public void SendEmail() throws AWTException {
        driver.get("http://mail.163.com/js6/main.jsp?sid=wCuNMnDMdXjAABKGusMMDoXrRXOgqAeD&df=mail163_letter#module=compose.ComposeModule%7C%7B%22type%22%3A%22compose%22%2C%22fullScreen%22%3Atrue%2C%22cid%22%3A%22c%3A1483534895676%22%7D");

        //点击写信
        driver.findElement(By.tagName("写 信")).click();
        //进入写信页面，填写收件人
        driver.findElement(By.id("_mail_link_23_306")).sendKeys("meyoungtester@163.com");
        //填写主题
        driver.findElement(By.tagName("主　题")).sendKeys("HelloWorld");
        //填写内容
        WebElement frame=driver.findElement(By.className("nui-scroll"));
        driver.switchTo().frame(frame);
        frame.sendKeys("Hello World");
        driver.switchTo().defaultContent();
        //点击附件
        driver.switchTo().frame("1483591938943_attachUpload");
        driver.findElement(By.id("1483591938943_attachBrowser")).click();
        //输入上传的文件
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_ENTER);
        //点击发送
        driver.findElement(By.tagName("发送")).click();
    }




}
