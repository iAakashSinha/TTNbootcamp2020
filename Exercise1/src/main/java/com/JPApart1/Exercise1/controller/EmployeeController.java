package com.JPApart1.Exercise1.controller;

import com.JPApart1.Exercise1.entity.Employee;
import com.JPApart1.Exercise1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@DeleteMapping(path = "/employees/{id}")
	public void deleteEmployee(@PathVariable Integer id){
		employeeService.deleteEmployee(id);
	}
	
	@PostMapping(path = "/employees-update")
	public void updateEmployee(@RequestBody Employee employee){
		employeeService.updateEmployee(employee);
	}
	
	@PostMapping(path = "/employees")
	public void addEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	@GetMapping(path = "/employees")
	public List<Employee> showAllEmployees(){
		List<Employee>tempList = employeeService.getAllEmployee();
		return tempList;
	}
	
	@GetMapping(path = "/employees-count")
	public Long returnCount(){
		return employeeService.getCount();
	}
	
	
	@GetMapping(path = "/employees-page")
	public List<Employee> getPage(){
		List<Employee> tempList= employeeService.getPage();
		return tempList;
	}
	
	
	@GetMapping(path = "/employee/{name}")
	public List<Employee> getEployeeByName(@PathVariable String name){
		return employeeService.findByName(name);
	}
	
	
	@GetMapping(path = "/employee/like/{c}")
	public List<Employee> getEmployeeByNameLike(@PathVariable Character c){
		return employeeService.findEmployeeStartWith(c);
	}
	
	
	@GetMapping(path = "/employee/between/{min}-{max}")
	public List<Employee> getEmployeeByAge(@PathVariable Integer min, @PathVariable Integer max){
		return employeeService.findEmployeeBetweenAge(min, max);
	}
}
