//Ques 4: WAP to create singleton class.

public class Ques4 {

    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

//
        System.out.println("HashCode for obj1 "+ obj1.hashCode());
        System.out.println("HashCode for obj2 "+ obj2.hashCode());
        System.out.println("HashCode for obj3 "+ obj3.hashCode());
    }
}

class SingletonClass{

    private static SingletonClass singletonObject= null;

    private SingletonClass(){
        System.out.print("This is an Object of Singleton Class with hash Code : ");
        System.out.println(this.hashCode());
    }

    public static SingletonClass getInstance(){
        if(singletonObject==null){
            singletonObject = new SingletonClass();
        }
        return singletonObject;
    }
}


