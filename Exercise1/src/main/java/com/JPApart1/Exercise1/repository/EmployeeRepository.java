package com.JPApart1.Exercise1.repository;

import com.JPApart1.Exercise1.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
	
//	List<Employee> findAllEmployee(Pageable pageable);
//List<Employee> findAllEmployee(Pageable pageable);
	
	List<Employee> findAllByName(String name);
	
	List<Employee> findAllByNameStartingWith(Character c);
	
	List<Employee> findAllByAgeBetween(Integer min, Integer max);
	
}
