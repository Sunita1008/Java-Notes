package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
private int rollno;
private String name;
@Autowired
/*Advantages of autowiring
 * =>It requires less code.
 * 
 * Disadvantage of autowiring
 * =>It can be achieved only on non-primitive or user defined data type(excluding String),not on primitive data type.
 */
/*The @Qualifier annotation in Spring help to pick the right bean among multiple beans of the same type
 * It helps spring to know which bean you want injected , resolving ambiguity.
*/
@Qualifier("createAddrObj2")
private Address address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public void display()
{
	System.out.println("Roll no="+rollno);
	System.out.println("name="+name);
	System.out.println(address);
}
}
