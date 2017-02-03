package com.demo.day1;

import org.testng.annotations.*;

/**
 * Created by Administrator on 2016/12/13 0013.
 */
public class TestngTest {
    @Test
    public void test1(){
        System.out.println("这个是@Test1");
    }
    @Test
    public void test4(){
        System.out.println("这个是@Test4");
    }
    @BeforeTest
    public void test2(){
        System.out.println("这个是@BeforeTest");
    }
    @BeforeMethod
    public void test3(){
        System.out.println("这个是@BeforeMethod");
    }
    @AfterMethod
    public void testA1(){
        System.out.println("这个是@afterMethod");
    }
    @AfterTest
    public void testA2(){
        System.out.println("这个是@AfterTest");
    }

}
