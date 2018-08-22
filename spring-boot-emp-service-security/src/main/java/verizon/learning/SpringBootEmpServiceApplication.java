package verizon.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootEmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmpServiceApplication.class, args);
	}
}
