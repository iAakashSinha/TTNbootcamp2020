//Create a functional interface whose method takes 2 integers and return one integer.

package Java8InterfaceExercise;

@FunctionalInterface
interface FunctionalInterfaceEXample{
    Integer func(Integer i1, Integer i2);
}

public class Ques2 {

    public static void main(String[] args) {
        FunctionalInterfaceEXample interfaceObject = (i1, i2)->{
            if(i1>i2)
                return i1;

            return i2;
        };

        interfaceObject.func(100,20);
    }
}
