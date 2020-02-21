//Ques5: Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.*;


class Employee {
    
    private String name;
    private Double age;
    private Double salary;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getAge() {
        return age;
    }
    
    public void setAge(Double age) {
        this.age = age;
    }
    
    public Double getSalary() {
        return salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    

}

class sortBySalary implements Comparator<Employee> {
    
    public int compare(Employee o, Employee o2) {
        return o.getSalary().intValue() - o2.getSalary().intValue();
    }
}

public class Ques5{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Aakash", 25.0, 2700.0));
        list.add(new Employee("Aayushi", 24.0, 2100.0));
        list.add(new Employee("Shivani", 24.0, 3000.0));
        list.add(new Employee("Abhishek", 23.0, 2000.0));
        list.add(new Employee("Himanshu", 25.0, 2500.0));

        Collections.sort(list, new sortBySalary());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}