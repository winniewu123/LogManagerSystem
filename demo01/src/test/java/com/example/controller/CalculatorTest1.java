package com.example.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wuxiaodong on 2017/8/30.
 */
public class CalculatorTest1 extends Calculator {
    //    参数化测试必须的构造函数@param expected     期望的测试结果，对应参数集中的第一个参数     * @param input1    测试数据，对应参数集中的第二个参数
//*@param input2    测试数据，对应参数集中的第三个参数     */
    @RunWith(Parameterized.class)
    public static class testAdd {
        int expected = 0;
        int input1 = 0;
        int input2 = 0;
        public testAdd(int expected, int input1, int input2) {
            System.out.println("Constructor Method with Parameters!");
            System.out.println();
            this.expected = expected;
            this.input1 = input1;
            this.input2 = input2;
        }
        @Before
        public void before1() throws Exception {
            System.out.println("Start1:");}
        @Before
        public void before2() throws Exception {
            System.out.println("Start2:");}
        @After
        public void after() throws Exception {
            System.out.println("Over!");}
        @Parameterized.Parameters
        public static List<Object[]> input(){
            System.out.println("Initialize Data!");
            return Arrays.asList(new Object[][]{{4,3,1},{7,2,5}});}
        @Test
        public void testAdd() throws Exception {
            Calculator test = new Calculator();
            Assert.assertEquals(expected,test.add(input1,input2));
        }
    }
}