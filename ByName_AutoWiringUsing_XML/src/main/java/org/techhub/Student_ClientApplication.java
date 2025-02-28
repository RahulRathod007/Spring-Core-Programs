package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Student_ClientApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		College c = (College)context.getBean("c");
		c.show();
	}

}
