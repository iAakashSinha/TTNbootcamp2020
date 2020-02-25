//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference

package Java8InterfaceExercise;

interface Ques4Interface{
    void createEmployee(String name, Integer age, String city);
}

public class Ques4 {
    public static void main(String[] args) {
        Ques4Interface interfaceObject = Employee::new;
        interfaceObject.createEmployee("Aakash ",23, "New Delhi");

    }


}

class Employee{
    String name;
    Integer age;
    String city;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Employee(String name, Integer age, String city){
        this.name = name;
        this.age= age;
        this.city= city;
        System.out.println("New Employee Added.");

    }
}