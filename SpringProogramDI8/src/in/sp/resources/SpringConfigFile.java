package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student StdObj()
	{
		Student std=new Student(1, "sahil", AddrObj());//manual DI
		return std;
	}
	
	@Bean
	public Address AddrObj()
	{
		Address add=new Address(200,"Jsr",1234);
		return add;
	}
}
