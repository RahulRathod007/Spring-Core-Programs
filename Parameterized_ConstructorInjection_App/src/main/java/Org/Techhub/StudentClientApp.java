package Org.Techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClientApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		Student std = (Student)context.getBean("student");
	}

}
