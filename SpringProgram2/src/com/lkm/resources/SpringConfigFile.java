package com.lkm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.lkm.bean.Student;




//@Configuration indicates that the class is spring configuration file
//->It indicates that annoted java class contains bean definitions and configuration settings for the spring application context
//@Configuration allow us to define beans and there dependencies in java based way instead of xml configuration file

@Configuration
public class SpringConfigFile {

	//In Xml configuration , we specify an "id" attribute to specify the bean name, 
	//and we specify class name using "class" attribute.
	
	//In java configuration the "method name" becomes the default bean name 
	//and the "return type" of the method determines the class of the object that will be created as the bean
	
	//the @Bean annotation in spring is used to declare a method as a factory for creating and configuring a bean managed by spring container
	
	/*The method annoted with @Bean will:
	 * =Create a new student Object
	 * =configure the Student object, setting its properties using setxx methods.
	 * =The default bean name for the method  will be "StdID1", which is same as the method name
	 * =Return the configured Student object
	 */
	  @Bean(name="student1")
	    public Student StdID1() {
	        Student std = new Student();
	        std.setName("Anushree");
	        std.setEmail("anu@gmail.com");
	        std.setRollno(67);
	        return std;
	    }
	  
	  @Bean(name="student2")
	    public Student StdID2() {
	        Student std = new Student();
	        std.setName("Anu");
	        std.setEmail("anu@gmail.com");
	        std.setRollno(67);
	        return std;
	    }
		
		//the object created by StdID1() method ,which is annoted with @Bean , is managed and created by the Spring container.
		//when the spring container initializes it , it will invoke the method to create Student object
		
		
	
}
