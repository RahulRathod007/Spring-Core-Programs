package Org.Techhub;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student_Config.class);
		Student std = (Student)context.getBean("s");
		System.out.println("ID \tName \tDept");
		System.out.println("====================");
		System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getDept());
	}

}
