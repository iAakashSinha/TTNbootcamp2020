//Write a method that takes a string and returns the number of unique characters in the string.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {
    
    
    public int CalculateUnique(String userString) {
        Set<Character> uniqueChar = new HashSet<Character>();
        char[] chars = userString.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            uniqueChar.add(chars[i]);
        }
        
        System.out.println("Unique characters are : " + uniqueChar);
        return uniqueChar.size();
    }
    
    public static void main(String[] args) {
        Ques2 object = new Ques2();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string :");
        String userString = sc.nextLine();
        
        
        int count = object.CalculateUnique(userString.toLowerCase());
        
        System.out.println("Unique characters are :" + count);
        
    }
}
