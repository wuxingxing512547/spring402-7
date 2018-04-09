package com.java1234.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java1234.entity.People;

public class Test {
	
	private ApplicationContext ac;

	@Before
	public void setUp() throws Exception {
		 ac=new ClassPathXmlApplicationContext("beans.xml");
	}

	//基本类型值
	@org.junit.Test
	public void test1() {
		People zhangsan=(People)ac.getBean("zhangsan");
		System.out.println(zhangsan);
		
		People lisi=(People)ac.getBean("lisi");
		System.out.println(lisi);
	}
	
}
