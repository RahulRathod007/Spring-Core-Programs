// WAP to create class name as Product with field id,name and price and perform setter injection using XML Configuration and annotation?
package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductClientApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		Product prod = (Product)context.getBean("p");
		prod.show();
	}
}
