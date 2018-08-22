package verizon.learning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import verizon.learning.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
