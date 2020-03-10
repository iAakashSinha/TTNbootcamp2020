package com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Controller;

import com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Model.EmployeeDao;
import com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Service.Employee;
import com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao service;

    @GetMapping(path = "/Hello-World")
    public String displayMessage()
    {
        return "Hello World";
    }

    //Retrieve-List-Of-Employees
    @GetMapping(path="/Employees")
    public List<Employee> retrieveAllEmployees(){
        return service.findAll();
    }


    //Retrieve-Specific-Employee
    @GetMapping(path="/Employees/{id}")
    public Employee retrieveOneEmployee(@PathVariable Integer id){

        Employee employee = service.findOne(id);
        if(employee==null)
            throw new UserNotFoundException("id - "+ id);
        return employee;
    }

    //Add-Employee
    @PostMapping(path="/Employees")
    public Employee   createEmployee(@Valid @RequestBody Employee employee)
    {
        Employee  saveEmployee = service.addEmployee(employee);
        return employee;
    }


    //Delete-A-Employee
    @DeleteMapping(path = "/Employees/{id}")
    public void deleteUSer(@PathVariable Integer id)
    {
        Employee employee = service.deleteById(id);
    }

    @PutMapping(path = "/Employees/{id}")
    public void putEmployee(@PathVariable Integer id, @RequestBody Employee employee){
        service.putEmployee(id,employee);
    }



}
