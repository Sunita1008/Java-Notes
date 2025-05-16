package in.sp.beans;

public class Student {
	private String name;
	private int roll;
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void display()
	{
		System.out.println("NAme="+name);
		System.out.println("Roll no="+roll);
		System.out.println("Address="+address);
	}
}
