package com.example.myapplicationsss;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 赖先生 on 2018/9/2.
 */
public class TestAllTest {

    private TestAll testAll;

    @Before
    public void setUp() throws Exception {

        testAll = new TestAll();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() throws Exception {

        assertEquals(testAll.sum(3,4),7);
    }

   /* @Test
    public void sum1() throws Exception {

        assertEquals(testAll.sum(3,4),6);
    }*/

}