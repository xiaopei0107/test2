package com.zxp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class LinuxTest {
  @Test
  public void linuxTest() {
	  Reporter.log("linuxTest测试方法开始");
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
