package com.six.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTestSxx {

    private TestSxx testSxx;

    @Before
    public void setUp() throws Exception {
     testSxx = new TestSxx();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum()throws Exception  {
        assertEquals(testSxx.sum(3,4),7);
    }
   /* @Test
    public void sum1()throws Exception  {
        assertEquals(testSxx.sum(3,4),6);
    }*/
}