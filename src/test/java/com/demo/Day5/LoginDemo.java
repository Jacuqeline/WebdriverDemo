package com.demo.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class LoginDemo {
    public static void Login(WebDriver driver , String Email, String PWD){
        driver.get("http://mail.163.com");
        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(PWD);
        driver.findElement(By.id("dologin")).click();

    }

}
