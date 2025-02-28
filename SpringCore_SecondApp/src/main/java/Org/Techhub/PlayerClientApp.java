package Org.Techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PlayerClientApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Player p = (Player)context.getBean("p");
		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
	}
}
