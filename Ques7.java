//Override the default method of the interface.


package Java8InterfaceExercise;

interface SampleInterface{
    default void func1(){
        System.out.println("this is a Default method of Interface- Sample Interface");
    }
}
public class Ques7 implements SampleInterface{

    @Override
    public void func1(){
        System.out.println("This is overloading default method of Interface.");
    }

    public static void main(String[] args) {
        Ques7 obj = new Ques7();
        obj.func1();
    }
}
