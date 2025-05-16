package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student StdObj()
	{
		Student std=new Student();
		std.setName("anuu");
		std.setRollno(34);
		//std.setAddress(AddrObj());//Manual DI
		//std.setSubject(SubjectObj());
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
	
	@Bean
	public Subjects SubjectObj()
	{
		Subjects sub=new Subjects();
		List<String> sub_list=new ArrayList<>();
		sub_list.add("Java");
		sub_list.add("Python");
		sub.setSubjects(sub_list);
		return sub;
		
	}
}

