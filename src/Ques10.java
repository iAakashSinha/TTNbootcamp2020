public class Ques10 {
}

class CoffeeShop{

}

class Person {
    private String Name;
    private String Age;
    private long phNumber;

    public Person() {
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Customer extends Person{
    int Cash;

}