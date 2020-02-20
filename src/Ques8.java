//Ques 8: WAP to read words from the keyboard until the word done is entered. For each word except done,
// report whether its first character is equalto  its last character.
// For the required loop, use a
//        a)while statement
//        b)do-while statement
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter A word: ");
        String word = keyboard.next();
        while(!word.equals("done"))
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
                System.out.println("First and last character are equals for the word: " + word);

            else
                System.out.println("First and last character are NOT equals for the word: " + word);

            word = keyboard.next();
        }
    }
}
