package org.techhub;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Parcel_ClientApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Parcel.xml");
		Courier c1 = (Courier)context.getBean("c");
		Parcel p = c1.getParcel();
		
		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSourceAddress()+"\t"+p.getDestAddress());
	}
}
