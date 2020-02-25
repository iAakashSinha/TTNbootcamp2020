//Implement multiple inheritance with default method inside  interface.

package Java8InterfaceExercise;
interface Interface1{
    default void show(){
        System.out.println("This is Interface 1");
    }
}

interface Interface2{
    default void show(){
        System.out.println("This is Interface 2");

    }
}

public class Ques8 implements Interface1, Interface2{

    @Override
    public void show() {
        System.out.println("This is Class Ques 8");
    }

    public static void main(String[] args) {
        Ques8 obj = new Ques8();
        obj.show();
    }
}
