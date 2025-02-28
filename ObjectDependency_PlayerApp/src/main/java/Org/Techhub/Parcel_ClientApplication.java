package Org.Techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Parcel_ClientApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("parcel.xml");
		Courier c = (Courier)context.getBean("c");
		c.show();
		c.Display();
	}

}
