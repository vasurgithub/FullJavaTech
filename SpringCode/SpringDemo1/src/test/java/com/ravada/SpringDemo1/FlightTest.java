package com.ravada.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
	        
	        FlightBean fb = (FlightBean)ap.getBean("flightBean");
	        fb.display();

	}

}
