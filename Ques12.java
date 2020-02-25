//Find the first even number in the integer list which is greater than 3.

package Java8InterfaceExercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//import java.util.function.Predicate;

public class Ques12 {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(2,3,4,5,6)
                .stream()
                .filter(e->e%2==0)
                .filter(e->e>3)
                .findFirst().orElse(-1));

//        Function<List<Integer>, Integer> object = (list)->{
////            int max = list.get(0);
//            for (Integer i :list) {
//                if(i%2==0 && i>3){
//                    return i;
//                }
//            }
//            System.out.println("Element not found.");
//            return 0;
//        };
//
//        System.out.println(object.apply(list1));
    }
}
