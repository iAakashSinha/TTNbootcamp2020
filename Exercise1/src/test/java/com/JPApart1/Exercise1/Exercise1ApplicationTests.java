package com.JPApart1.Exercise1;

import com.JPApart1.Exercise1.entity.Employee;
import com.JPApart1.Exercise1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class Exercise1ApplicationTests {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	@Test
	void testCreate(){
		Employee employee = new Employee();
		employee.setName("Aakash");
		employee.setAge(21);
		employee.setLocation("Delhi");
		employeeRepository.save(employee);
	}

}
