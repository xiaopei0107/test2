package com.zxp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class PassTest {
  @Test
  public void test1() {
	  Reporter.log("测试方法test1开始");
	  Assert.assertEquals("1", "1");
	  Reporter.log("测试方法test1结束");
  }
  @Test
  public void test2() {
	  Reporter.log("测试方法test2开始");
	  Assert.assertEquals("1", "1");
	  Reporter.log("测试方法test2结束");
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("PassTest测试类开始");
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("PassTest测试类结束");
  }

}
