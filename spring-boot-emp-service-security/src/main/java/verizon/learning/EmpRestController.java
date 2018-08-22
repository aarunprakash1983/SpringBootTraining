package verizon.learning;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import verizon.learning.Emp;

@RestController
public class EmpRestController {
	@Autowired
	EmpJpaData dataservice;

	@RequestMapping(path="/greet",method=RequestMethod.GET)
	 public String getMessage() {
		 return "Hello";	 
	}
	
	@RequestMapping(
			path ="/emp/{id}",
			method= RequestMethod.GET,
			produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getEmpById(@PathVariable("id") int id) {
		return ResponseEntity.ok(dataservice.findById(id));
		
	}
	
	@RequestMapping(
			path ="/emp",
			method= RequestMethod.GET,
			produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity listAll() {
		return ResponseEntity.ok(dataservice.getEmpList());
	}
	
	@RequestMapping(
			path ="/emp/save",
			method= RequestMethod.POST,
					consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
					produces=org.springframework.http.MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity saveEmp(@RequestBody Emp e) {
		return ResponseEntity.ok(dataservice.save(e));
	}
}
