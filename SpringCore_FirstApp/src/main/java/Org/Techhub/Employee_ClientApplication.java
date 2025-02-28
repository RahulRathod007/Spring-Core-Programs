package Org.Techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee_ClientApplication {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("Employee.xml");
		BeanFactory bf = new XmlBeanFactory(r) ;
		
		System.out.println("Id \t Name \t Sal");
//		Object obj = bf.getBean("e"); //or
		Employee emp = (Employee)bf.getBean("e");
		emp.show();
		
		Object obj1 = bf.getBean("em"); 
		Employee emp1 = (Employee)obj1;
		
		emp1.show();
		
	}

}
