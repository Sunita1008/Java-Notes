package com.lkm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lkm.acc.Student;

public class Main {

	public static void main(String args[])
	{
		
		/*The ApplicationContext(Spring Container) is an interface in Spring which is used to manage beans,
		 * handle application events, and access recources.
		 * 
		 *  Some implemented classess of ApplicationContexr are:-
		 *  1.ClassPathApplicationContext(used for XML configuration)
		 *  2.AnnotationConfigApplicationContext(used for Java configuration)
		 */
		String config_loc="/com/lkm/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		Student std=(Student)context.getBean("StdID1");
		std.display();
		System.out.println("============================================");
		Student std2=(Student)context.getBean("StdID2");
		std2.display();
		
	}
}
