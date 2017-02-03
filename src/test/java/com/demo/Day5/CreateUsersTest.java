package com.demo.Day5;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/31 0031.
 */
public class CreateUsersTest extends BaseCase {
    long time=System.currentTimeMillis();
//    @Test
//    public void time1(){
//      System.out.println(time);
//    }
    @Test
    public void createEmail() throws InterruptedException {
        driver.get("http://mail.163.com/");
        Thread.sleep(5000);

        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.id("changepage")).click();
        String handle1=driver.getWindowHandle();
        for (String handles:driver.getWindowHandles()){
            if (handles.equals(handle1)){
                continue;

            }
            driver.switchTo().window(handles);
        }
            driver.findElement(By.xpath("//*[@id=\"tabsUl\"]/li[1]/a")).click();

            driver.findElement(By.id("nameIpt")).sendKeys("E"+String.valueOf(time));

            driver.findElement(By.id("mainPwdIpt")).sendKeys("Jacqueline321");

            driver.findElement(By.id("mainCfmPwdIpt")).sendKeys("Jacqueline321");

            driver.findElement(By.id("mainMobileIpt")).sendKeys(String.valueOf(time/100));

            driver.findElement(By.id("vcodeIpt")).sendKeys("error");
            driver.findElement(By.id("mainAcodeIpt")).sendKeys("123321");
            driver.findElement(By.id("mainRegA")).click();
            Thread.sleep(5000);
            String error1=driver.findElement(By.id("m_mainAcode")).getText();
           // String error1=driver.findElement(By.class("txt-err")).getText();
            System.out.println(error1);
                //    Assert.assertEquals(error1,"  手机验证码不正确，请重新填写");


    }
}
