package verizon.learning;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpJpaData {
	
    @Autowired
    EmpRepository repo;
    
    public Emp findById(int id) {
    	Optional<Emp> o= repo.findById(id);
    	if(o.isPresent()) {
    		return o.get();
    	}
    	else
    	{
    		throw new RuntimeException("No Emp Found");
    		
    	}
    }
    
    public List<Emp> getEmpList() {
    	System.out.println("Find all method called");
    	return repo.findAll();
    }
}
