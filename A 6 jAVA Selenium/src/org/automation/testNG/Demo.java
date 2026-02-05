package org.automation.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test()
	{
		Reporter.log("1 st test case executed",true);
	}
    
	@Test
	public void m1()
	{
		Reporter.log("2 nd test case executed",true);
	}
	@Test
	public void method1()
	{
		Reporter.log("3 rd test case executed",true);
	}


}
