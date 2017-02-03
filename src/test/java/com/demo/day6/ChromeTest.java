package com.demo.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class ChromeTest {
    @Test
    public void test1(){
        String downloadFilepath="D:\\";
        HashMap<String,Object> chrmePrefs=new HashMap<String, Object>();
        chrmePrefs.put("profile.default_content_setting.popups",0);
        chrmePrefs.put("download.default_directory",downloadFilepath);
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",chrmePrefs);

        System.setProperty("webdriver.chrome.driver",".//drivers//chromedrive");
        WebDriver driver=new ChromeDriver(options);

        driver.get("Http://rj.baidu.com/soft/detail/13478.html?ald");
        driver.findElement(By.className("normal_download")).click();

    }

}
