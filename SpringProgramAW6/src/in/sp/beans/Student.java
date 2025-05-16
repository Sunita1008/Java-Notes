package in.sp.beans;

public class Student {
	private String name;
	private int roll;
	private Address address;
	


	public Student(String name, int roll, Address address) {
	
		this.name = name;
		this.roll = roll;
		this.address = address;
	}



	public void display()
	{
		System.out.println("NAme="+name);
		System.out.println("Roll no="+roll);
		System.out.println("Address="+address);
	}
}
