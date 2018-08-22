/**
 * 
 */
package verizon.learning.dao;

import org.springframework.stereotype.Repository;

import verizon.learning.entity.*;
/**
 * @author System no 14
 *
 */
//@Repository
public class StudentsDaoImplementor implements StudentsDao {

	@Override
	public String save(Students objStudent) {
		// TODO Auto-generated method stub
		System.out.println("JDBC..Testing..Student information Saved");
		return "success";
	}
	
	

}
