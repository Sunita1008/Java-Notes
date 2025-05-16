package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

import in.sp.mappers.*;
import in.sp.beans.*;
import java.util.*;




public class App 
{
    public static void main( String[] args )
    {
//    	String std_roll="26";
//    	String std_name="anushri";
//    	String std_marks="60";
      ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
      JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
      
      //-----------iNSERT OPERATION------------------------------
//      String insert_sql_query="INSERT INTO student VALUES(?,?,?)";
//     int count= jdbcTemplate.update(insert_sql_query,std_roll, std_name, std_marks);
//     if(count>0)
//     {
//    	 System.out.println("insertion success");
//     }
//     else {
//    	 System.out.println("insertion failed");
//     }
      
      
     //-----------UPDATE OPERATION------------------------------
//      String std_marks="98";
//      String std_roll="25";
//     String update_sql_query="UPDATE student SET std_marks=? where std_roll=?";
//     int count=jdbcTemplate.update(update_sql_query,std_marks,std_roll);
//    
//     if(count>0)
//     {
//    	System.out.println("updation success"); 
//     }
//     else
//     {
//    	 System.out.println("updation failed");
//     }
    
      
      //--------------DELETION OPERATION--------------------------------
      
//      String std_roll="23";
//      
//      String delete_sql_query="DELETE FROM student WHERE std_roll=? ";
//      int count=jdbcTemplate.update(delete_sql_query,std_roll);
//      if(count>0)
//        {
//       	System.out.println("deletion success"); 
//        }
//        else
//        {
//       	 System.out.println("deletion failed");
//        }
      
      //----------------SELECT OPERATION-------------------
      String select_sql_query="SELECT * FROM student";
      List<Student> std_list= jdbcTemplate.query(select_sql_query,new StudentRowMapper());
      for(Student std:std_list)
      {
    	  System.out.println("Roll_no="+std.getRollno());
    	  System.out.println("Name="+std.getName());
    	  System.out.println("Marks="+std.getMarks());
    	  System.out.println("-------------------------------------");
      }
      
    }
}
