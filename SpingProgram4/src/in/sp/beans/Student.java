package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* the @Component annotation in Spring is used to declare a class as a Spring bean, 
 * which is automatically detected and managed during application startup
 * 
 * ->It help spring automatically detect and manage these beans during application startup , 
 * making them available for DI and other Spring features
 * 
 * @Component is also known as "stereotype annotation"
 * 
 * Some commonly used annotation that are based on @Component are:
 * 1.@Service
 * 2.@Repository
 * 3.@Controller
 */
@Component
public class Student {
	
	//the @Value annotation is used to inject values in Spring bean fields and methods.
	//@Values is used to inject values from external sources
@Value("Sunita")
private String name;
@Value("201")
private int roll;
@Value("45.78f")
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

public void display() {
	
	System.out.println("Name="+name);
	System.out.println("Roll no="+roll);
	System.out.println("Marks="+marks);
}

}

