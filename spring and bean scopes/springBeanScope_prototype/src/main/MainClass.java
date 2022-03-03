package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Message;

public class MainClass {

	public static void main(String[] args) {
		//it is a IOC-inverse of control
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");//created spring container to instantiate object
		
		Message message1 = (Message) applicationContext.getBean("hello");
		
		
		
	//	Message m = new Message() this object was created by spring container-ApplicationContext
		
		System.out.println("this is my object: " + message1);
		
		Message message2 = (Message) applicationContext.getBean("hello");
		
		System.out.println("this is my object m2: " + message2);
		
		   
	}

}