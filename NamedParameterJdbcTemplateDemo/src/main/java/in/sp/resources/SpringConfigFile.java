package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

	@Bean
	public DriverManagerDataSource myDataSource()
	{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	return dataSource;
	}
	
	/*NamedParameterJdbcTemplate is a Spring class for executing SQL queries with named parameters instead of traditional "?" placeholder.
	 * It improves readability by replacing positional placeholder with named parameters, enhancing code maintainability and 
	 * reducing errors in SQL queries.
	 */
	@Bean
	public NamedParameterJdbcTemplate myJdbcTemplate()
	{
		
		return new NamedParameterJdbcTemplate(myDataSource());
		
	}
	
}
