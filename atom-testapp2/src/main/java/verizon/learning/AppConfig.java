package verizon.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import verizon.learning.dao.StudentsDaoImplementor;

@Configuration
@ComponentScan(basePackages="verizon.learning")
public class AppConfig {

	/*If you comment the below method... UnComment @Repository in StudentsDaoImplementor*/
	@Bean
	public StudentsDaoImplementor myStudentsDao()
	{
		return new StudentsDaoImplementor();
	}
	
	

}
