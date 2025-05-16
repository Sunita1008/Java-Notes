package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	NamedParameterJdbcTemplate npJdbcTemplate=(NamedParameterJdbcTemplate) context.getBean(NamedParameterJdbcTemplate.class);
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("key_rollno", 27);
    	map.put("key_name", "kriti");
    	map.put("key_marks", 78.8f);
    	
    	
    	String insert_sql_query="INSERT INTO student VALUES(:key_rollno,:key_name,:key_marks)";
    	int count=npJdbcTemplate.update(insert_sql_query, map);
    	if(count>0)
    	{
    		System.out.println("insertion successful");
    	}
    	else
    	{
    		System.out.println("insertion failed");
    	}
    	
    }
}
