package com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Model;

import com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Service.Employee;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class EmployeeDao {

    List<Employee> ls=new ArrayList<>();


    //Retrieve-list-of-Employees
    public List<Employee> findAll(){
        return ls;
    }

    //Add-Employee
    public Employee  addEmployee(Employee employee)
    {
        ls.add(employee);
        return employee;
    }

    //Find-One-Employee
    public Employee findOne(Integer id)
    {
        for (Employee employee:ls){
            if(employee.getId()==id)
                return employee;
        }
        return null;
    }

    //Delete-One-Employee
    public Employee deleteById(Integer id)
    {
        Iterator<Employee> iterator = ls.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee.getId()==id) {
                iterator.remove();
                return employee;
            }
        }
        return null;
    }

//    Employee-Put-Mapping
    public void putEmployee(Integer id, Employee employee){

        Iterator<Employee> iterator = ls.iterator();
        while (iterator.hasNext()){
            if(employee.getId()==id)
            {
                iterator.next().setName(employee.getName());
                iterator.next().setAge(employee.getAge());
                iterator.next().setBirthDate(employee.getBirthDate());
            }
        }
    }
}
