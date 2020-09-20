package com.jinu.dom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jinu.dom.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	@Query("select e from Employee e where e.EmpName =:name and e.rollNo=:rollno")
	public List<Employee> findByNameAndRollno(@Param("name") String name, @Param("rollno") int rollno);
}
