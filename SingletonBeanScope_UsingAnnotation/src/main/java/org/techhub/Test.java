package org.techhub;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t")
@Scope(scopeName = "singleton")
public class Test {
	public Test()
	{
		System.out.println("I am Singleton Bean Scope");
	}
}
