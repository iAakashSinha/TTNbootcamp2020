package com.JPApart1.Exercise1.service;

import com.JPApart1.Exercise1.entity.Employee;
import com.JPApart1.Exercise1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void deleteEmployee(Integer id){
		employeeRepository.deleteById(id);
	}
	
	public void updateEmployee(Employee employee){
		employeeRepository.save(employee);
	}
	
	public void addEmployee(Employee employee){
		employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> tempList = new ArrayList<>();
		employeeRepository.findAll().forEach(e->tempList.add(e));
		return tempList;
	}
	
	public Long getCount(){
		return employeeRepository.count();
	}
	
	public List<Employee> getPage(){
		Pageable pageable = PageRequest.of(0,2, Sort.by("age"));
		List<Employee> employeeList = employeeRepository.findAll(pageable).toList();
		return employeeList;
//		Pageable pageable = PageRequest.of(0,2, Sort.by("age"));
//		List<Employee> tempList= (List<Employee>) employeeRepository.findAll(pageable);
//		return tempList;
	}
	
	public List<Employee> findByName(String name){
		return employeeRepository.findAllByName(name);
	}
	
	public List<Employee> findEmployeeStartWith(Character c){
		return employeeRepository.findAllByNameStartingWith(c);
	}
	
	public List<Employee> findEmployeeBetweenAge(Integer min, Integer max){
		return employeeRepository.findAllByAgeBetween(min, max);
	}
}
