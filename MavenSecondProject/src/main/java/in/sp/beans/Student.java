package in.sp.beans;

public class Student {

	private String name;
	private int roll;
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println("name="+name);
		System.out.println("roll no="+roll);
		System.out.println("marks="+marks);
	}
}

