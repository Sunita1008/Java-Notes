package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan is used to instruct Spring framework to perform component scanning
//It will scan the specified packages for the class annotated with annotation like @Component , @Service , @Repository & @Controller and then registered as Spring beans for future use
@Configuration
//Different way to write this
//@ComponentScan("in.sp.beans")


//@ComponentScan({"in.sp.beans"})

@ComponentScan(basePackages= {"in.sp.beans"})
public class SpringConfigFile {


	 
		
		
	
}