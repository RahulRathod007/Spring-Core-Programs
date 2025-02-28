package Org.Techhub;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Player_ClientApplication {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("player.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		
		System.out.println("Id\tName\tRuns");
		System.out.println("========================");
		Team t = (Team)bf.getBean("t");
		t.show();
		Team t1 = (Team)bf.getBean("t1");
		t1.show();
	}
}
