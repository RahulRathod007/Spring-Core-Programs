package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(DBConfig.class);
		
		Courier c1 = (Courier)context.getBean("c");
		System.out.println("Company Details : ");
		System.out.println("---------------------------------------------");
		System.out.println(c1.getCompanyName()+"\t"+c1.getWebsite());
		
		System.out.println("\nParcel Details :");
		System.out.println("--------------------------------------------");
		Parcel p1 = c1.getParcel();
		System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getSourceAddress()+"\t"+p1.getDestAddress());
	}
}
