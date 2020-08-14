package com.springdemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.Demo.DemoBean;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
      DemoBean demo = context.getBean("DemoBean", DemoBean.class);
      demo.display();
      context.close();
	}

}
