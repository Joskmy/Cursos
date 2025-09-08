package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola" ,StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("" ,StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        StringUtil.repeat("hola", -1);
    }

    @Test
    public void isNotEmpty(){
        Assert.assertFalse(StringUtil.isEmpty("hola"));
    }

    @Test
    public void isEmpty(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void isEmpty_null() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void isNotEmpty_blank() {
        Assert.assertFalse(StringUtil.isEmpty("   "));
    }

}
