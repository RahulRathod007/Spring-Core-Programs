package org.techhub;

import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeClientApp {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("Product.xml");
		BeanFactory bf = new XmlBeanFactory(r);
	
		System.out.println("Id\tName\tPrice");
		System.out.println("=====================");
		Product prod1 = (Product)bf.getBean("p1");
		prod1.show();
	
		Product prod2 = (Product)bf.getBean("p2");
		prod2.show();
		
		Product prod3 = (Product)bf.getBean("p3");
		prod3.show();
		
		Product prod4 = (Product)bf.getBean("p4");
		prod4.show();
		
		Product prod5 = (Product)bf.getBean("p5");
		prod5.show();
	}
}
