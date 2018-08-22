package verizon.learning;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import verizon.learning.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
	@Query(value="select e from Emp e where e.name like 'K%'")
	public List<Emp> getNamesWithS();

}
