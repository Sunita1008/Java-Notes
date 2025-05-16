package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfig {

	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		addr.setCity("nagpur");
		addr.setHouseno(230);
		addr.setPincode(23456);
		return addr;
		
	}
	
	@Bean
	public Student createStuObj() {
		Student std=new Student();
		std.setName("anuu");
		std.setRollno(34);
		std.setAddress(createAddrObj());
		return std;
		
	}
}
