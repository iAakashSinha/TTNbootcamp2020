//Using (instance) Method reference create and apply add and subtract method
// and using (Static) Method reference create and apply multiplication method for the functional interface created.

package Java8InterfaceExercise;

interface Ques3Interface{
    public void something(int x , int y);
}

public class Ques3 {
    public static void multiply(int x , int y)
    {
        System.out.println("The multiplication is :" + (x*y));
    }


    public void addsub(int x, int y)
    {
        System.out.println("Additon is :"+ (x+y));
        System.out.println("Subtraction is :"+ (x-y));
    }


    public static void main(String[] args) {
        Ques3Interface operate1 = Ques3::multiply; //(Static) Method reference
        operate1.something(5,6);

        Ques3 methodReference = new Ques3(); // (instance) Method reference
        Ques3Interface operate2 = methodReference::addsub;
        operate2.something(10,6);

    }
}