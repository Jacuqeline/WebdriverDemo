package com.demo.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/13 0013.
 */
public class AssertTest {
    @Test
    public void testEquals(){
        String a="1234";
        String b="1234";
        Assert.assertEquals(a,b);

    }
    @Test
    public void testNotEquals(){
        int a=1;
        int b=1;
        Assert.assertNotEquals(a,b);

    }
    @Test
    public void assertNotNull(){
        String a="";
        Assert.assertNotNull(a);
    }
    @Test
    public void testNull(){
        String a=null;
        Assert.assertNull(a);
    }
}
