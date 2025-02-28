package Org.Techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee_ClientApplication {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("Employee.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		
//		Object obj = bf.getBean("e");
//		Employee emp = (Employee)obj;
		
		Employee emp = (Employee)bf.getBean("e");
	}
}
