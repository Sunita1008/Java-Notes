package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollno;
	private String name;
	/*@Autowired annotation in spring is used for automatic DI 
	 * It tell Spring "Hey just grab the right piece(bean) and plug it in here to make this work
	 * In short, it simplifies your code by letting spring handle object connection for u
	*/
	@Autowired
	private Address address;
	@Autowired
	private Subjects subject;
	
	


	






	public int getRollno() {
		return rollno;
	}






	public void setRollno(int rollno) {
		this.rollno = rollno;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	





	public void display()
	{
		System.out.println("Roll no="+rollno);
		System.out.println("name="+name);
		System.out.println(address);
		System.out.println(subject);
	}
}
