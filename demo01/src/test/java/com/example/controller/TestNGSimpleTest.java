package com.example.controller;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by wuxiaodong on 2017/8/31.
 */
public class TestNGSimpleTest {
    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }
}
