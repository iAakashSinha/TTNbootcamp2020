//Create and access default and static method of an interface.


package Java8InterfaceExercise;
interface Interface{
    default void defaultMethod(){
        System.out.println("this is a default method in Interface");
    }
    static void staticMethod(){
        System.out.println("This is a static method in Interface ");
    }
}


public class Ques6 implements Interface{

    public static void main(String[] args) {
        Interface.staticMethod();

       Ques6 obj = new Ques6();
       obj.defaultMethod();
    }
}
