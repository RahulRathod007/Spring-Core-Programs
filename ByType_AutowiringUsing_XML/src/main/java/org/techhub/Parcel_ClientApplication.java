package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Parcel_ClientApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Parcel.xml");
		Courier c = (Courier)context.getBean("c");
		c.show();
	}
}
