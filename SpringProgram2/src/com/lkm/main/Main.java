package com.lkm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lkm.bean.Student;
import com.lkm.resources.SpringConfigFile;


public class Main {

	public static void main(String[] args) {
		/*The ApplicationContext(Spring Container) is an interface in Spring which is used to manage beans,
		 * handle application events, and access recources.
		 * 
		 *  Some implemented classess of ApplicationContext are:-
		 *  1.ClassPathApplicationContext(used for XML configuration)
		 *  2.AnnotationConfigApplicationContext(used for Java configuration)
		 */
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class) ;
		
    	Student std=(Student)context.getBean("student2");
		std.display();
		
		System.out.println("-------------------------------------------------");
		Student std2=(Student)context.getBean("student1");
		std2.display();
		
//		Student std=context.getBean(Student.class);
//		std.display();
	}

}
