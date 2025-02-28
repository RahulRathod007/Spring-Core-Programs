package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Test t1 = (Test)context.getBean("t");
		Test t2 = (Test)context.getBean("t");
		Test t3 = (Test)context.getBean("t");
		Test t4 = (Test)context.getBean("t");
	}
}
