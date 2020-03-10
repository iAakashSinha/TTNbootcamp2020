package com.RestfullWebService.Assignment1.RestFullWebServiceAssignment1.Service;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;


public class Employee {
    private Integer id;

    @Size(min = 2,message = "Name should have atleast 2 characters.")
    private String name;
    private int age;
    @Past
    private Date birthDate;

    protected Employee(){

    }

    public Employee(Integer id, String name, int age, Date birthDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }
}
