//Implement following functional interfaces from java.util.function using lambdas:
//
//        (1) Consumer
//
//        (2) Supplier
//
//        (3) Predicate
//
//        (4) Function



package Java8InterfaceExercise;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {
//        Consumer Functional Interface
        Consumer<Integer> consumerObject =(e1)->{
            System.out.println("consumed : "+ e1);
        };
//      Supplier Functional Interface
        Supplier<Integer> supplierObject = ()->{
            System.out.println("Supplier :");
            return 100;
        };
//      Predicate Function Interface
        Predicate<Integer> predicateRefObject = (e1)->{
            if(e1%2==0)
                return true;

            return false;

        };

//        Function Functional Interface
        Function<Integer,Integer> functionObject=(e1)->{

            return e1*e1;
        };

        System.out.println(functionObject.apply(10));
        System.out.println(predicateRefObject.test(100));
        System.out.println(supplierObject.get());
        consumerObject.accept(100);
    }
}
