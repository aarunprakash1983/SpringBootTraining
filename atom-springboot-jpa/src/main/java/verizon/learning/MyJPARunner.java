package verizon.learning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import verizon.learning.Emp;



@Component
public class MyJPARunner implements CommandLineRunner {   
	
    @Autowired
    EmpRepository repo;
    
	@Override
	public void run(String... args) throws Exception {
		for(Emp e:repo.findAll()) {
			System.out.println(e.getName() + " " + e.getCity());
		}
		
		System.out.println("Custom Query");
		for(Emp e:repo.getNamesWithS()) {
			System.out.println(e.getName() + " " + e.getCity());
		}
	}
}

