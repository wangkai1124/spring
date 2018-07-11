package demo.d01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		//HelloSpring hello=new HelloSpring();
		//hello.setWho("Tom");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hello=(HelloSpring) context.getBean("helloSpring");
		//HelloSpring hello=context.getBean(HelloSpring.class);
		
		hello.show(); 
	}
	
}
