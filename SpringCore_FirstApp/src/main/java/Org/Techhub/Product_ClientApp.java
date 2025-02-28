package Org.Techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Product_ClientApp {
	public static void main(String[] args) {

		Resource res = new ClassPathResource("Product.xml");
		BeanFactory bf = new XmlBeanFactory(res);

		System.out.println("Id \tName \tPrice");
		System.out.println("======================");
		Product prod = (Product) bf.getBean("p");
		prod.show();

		Product prod1 = (Product) bf.getBean("p1");
		prod1.show();

	}

}
