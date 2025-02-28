package org.techhub;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t")
@Scope(scopeName = "prototype")
public class Test {
	public Test()
	{
		System.out.println("I am Prototype Bean Scope");
	}
}
