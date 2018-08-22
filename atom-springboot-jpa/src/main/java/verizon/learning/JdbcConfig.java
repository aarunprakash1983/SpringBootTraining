package verizon.learning;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	
	/*Approach 3* when datasource Autowired
	@Autowired
	DataSource ds2;
	*/
	
	@Bean
	public 	DriverManagerDataSource dataSource() {
		 DriverManagerDataSource dsSource = new DriverManagerDataSource();
		 dsSource.setDriverClassName("com.mysql.jdbc.Driver");
		 dsSource.setUrl("jdbc:mysql://localhost:3306/springdb?useSSL=false");
		 dsSource.setUsername("root");
		 dsSource.setPassword("admin");
		 return dsSource;
	}
	
	/*Approach 3* when datasource Autowired
	@Bean
	public JdbcTemplate jt() {
	JdbcTemplate jt = new JdbcTemplate();
	jt.setDataSource(ds2);
	return jt;
	}
	*/
	
	/*Approach 1 */
	@Bean
	public JdbcTemplate jt() {
	JdbcTemplate jt = new JdbcTemplate();
	jt.setDataSource(dataSource());
	return jt;
	}
	
	
	/*Approach 2
	@Bean
	public JdbcTemplate jt(DataSource ds) {
	JdbcTemplate jt = new JdbcTemplate();
	jt.setDataSource(ds);
	return jt;
	}*/
}
