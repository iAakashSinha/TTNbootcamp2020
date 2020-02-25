//Find average of the number inside integer list after doubling it.

package Java8InterfaceExercise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques11 {
    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1,4,2,4,5,6,3,6,2)
                .stream()
                .mapToInt(e->e*2)
                .average());
    }
}
