package com.demo.day6;

import com.demo.Day5.LoginDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URL;

/**
 * Created by Administrator on 2017/1/19 0019.
 */
public class DataDriver {
    @DataProvider(name="data1")
    public Object[][] testDataDriver(){
        return new Object[][]{{"Y","Y"},{"Y","N"},{"N","N"}};


    }
    @Test(dataProvider="data1")
    public void testData(String userName,String pwd){
        System.out.println(userName);
        System.out.println(pwd);


    }
    @Test(dataProvider="data2")
    public void testData(String userName,String pwd) throws InterruptedException {
        System.out.println(userName);
        System.out.println(pwd);

    @Test(dataProvider="data2")
        public void testLogin(String userName,String pwd){
        WebDriver driver=new FirefoxDriver();
        driver.get("Http://mail.163.com");


        LoginDemo.login(driver,userName,pwd);
        Thread.sleep(3000);
        driver.quit();
    }
    @DataProvider(name="data4")
            public Object[][] test1(){
            return new Object[][]{
                    {"http://192.168.1.113:5555","firefox"};
                    {"http://192.168.1.111:5555","chrome"}};


        }
     @Test(dataProvider="data4")
             public void testGrid2(String url,String browser ){
             DesiredCapabilities dc=null;
             if (browser =="firefox"){
                 dc=DesiredCapabilities.firefox();

             }else if (browser=="chrome"){
                 dc=DesiredCapabilities.chrome();
             }else{
                 System.out.println("error");
             }
             WebDriver driver=new RemoteWebDriver(new URL(url+"wd/hub"),dc);
                driver.get("http://www.baidu.com");
                Thread.sleep(3000);
                driver.quit();
             }
        }
}
