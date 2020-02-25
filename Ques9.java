//Collect all the even numbers from an integer list.

package Java8InterfaceExercise;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
//        System.out.println(
                Arrays.asList(1,2,3,4,5,6,7)
                .stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
