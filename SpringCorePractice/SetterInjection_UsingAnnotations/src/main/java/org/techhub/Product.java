package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p")
public class Product {
	@Value("1")
	private int id;
	@Value("Book")
	private String name;
	@Value("100")
	private int price;
	
	public void show()
	{
		System.out.println(id+"\t"+name+"\t"+price);
	}
}
