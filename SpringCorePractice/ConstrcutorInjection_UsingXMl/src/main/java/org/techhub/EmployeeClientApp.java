package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClientApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		Employee e = (Employee)context.getBean("emp");
	}
}