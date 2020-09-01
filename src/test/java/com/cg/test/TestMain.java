package com.cg.test;

import org.junit.Assert;
import org.junit.Test;

public class TestMain {
	
	@Test
    public void test1() {
        Assert.fail("test1 has Fail");
    }
    @Test
    public void test2() {
    }
    @Test
    public void test3() {
        Assert.fail("test3 has Fail");
    }

}
