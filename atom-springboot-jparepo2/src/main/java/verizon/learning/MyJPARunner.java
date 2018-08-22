package verizon.learning;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import verizon.learning.Emp;



@Component
@Transactional
public class MyJPARunner implements CommandLineRunner {   
	
    @PersistenceContext
	EntityManager em;
    
    @Autowired
    EmpRepository repo;
    
    @Override
	public void run(String... args) throws Exception {
		repo.findAll().forEach(e-> {
			System.out.println(e.getName()+" from "+ e.getCity());
			});	
		
		System.out.println("Custom Query");
		repo.getNamesWithS().forEach(e -> {
			System.out.println("custom Query result " + e.getName());
		});
		
		System.out.println("????????????? "+repo.existsById(1201));
		System.out.println("????????????? "+repo.findById(new Integer(1201)));

	}
}

