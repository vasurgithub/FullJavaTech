package com.springdemo.Demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

public class DemoBean implements BeanNameAware,InitializingBean, ApplicationContextAware, DisposableBean {
    String message;
	public DemoBean() {
		// TODO Auto-generated constructor stub
		System.out.println("DemoBean Constructor");
	}
	public void setMessage(String message) {
		this.message=message;
	}
	
	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware's setBeanName()");
	}
    
	public void aferPropertiesSet() throws Exception {
		System.out.println("InitializingBean's afterPropertiesSet()");
		
	}
	
	public void setUp( ) {
		 System.out.println("custom init method");
	}
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
		System.out.println("BeanFactory's setBeanFactory()");
	}
 	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
 throws BeansException { 
		System.out.println("Application");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean's destroy()");
	}
	
	public void clear() {
		 System.out.println("custom destroy");
	}
 
	public void display() {
		System.out.println("Message: "+message);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}