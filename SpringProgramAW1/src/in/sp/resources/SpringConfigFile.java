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
		Student std=new Student();
		std.setName("anuu");
		std.setRollno(34);
		//std.setAddress(AddrObj());//Manual DI
		return std;
	}
	
	@Bean
	public Address AddrObj()
	{
		Address addr=new Address();
		addr.setCity("nagpur");
		addr.setHouseno(230);
		addr.setPincode(23456);
		return addr;
	}
}

