package com.example.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

/**
 * Created by wuxiaodong on 2017/8/30.
 */
public class TTest {
    @Test
    public void plus() throws Exception {
        int z=new T().plus(2, 2);
        Assert.assertThat(z,is(4));
    }

    @Test
    public void minus() throws Exception {
    int b=new T().minus(3,1);
        Assert.assertThat(b,greaterThan(1));
    }

}