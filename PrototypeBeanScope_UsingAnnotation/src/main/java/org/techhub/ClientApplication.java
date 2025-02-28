package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		Test t1 = (Test)context.getBean("t");
		Test t2 = (Test)context.getBean("t");
		Test t3 = (Test)context.getBean("t");
		Test t4 = (Test)context.getBean("t");
	}
}
