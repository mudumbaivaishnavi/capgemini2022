package springdemo1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Message;

public class MainClass {

	public static void main(String[] args) {
		//it is a IOC-inverse of control
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");//created spring container to instantiate object
		
		Message message = (Message) applicationContext.getBean("mymessage");
		
		System.out.println(message.getMessage());
		
	//	Message m = new Message() this object was created by spring container-ApplicationContext
		
		message.show();//called without created object   
	}

}