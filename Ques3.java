//Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques3 {
    
    
    public void CountOccurrence(String userString) {
        
        char[] charArr = userString.toCharArray();
        
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        
        for (Character c :
                charArr) {
            
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else
                countMap.put(c, 1);
        }
        for (Map.Entry entry :
                countMap.entrySet()) {
            System.out.println(entry.getKey() + " is Occurring :" + entry.getValue()+" Times");
        }
        
    }
    
    public static void main(String[] args) {
        
        Ques3 object = new Ques3();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        
        String userString = sc.nextLine();
        
        
        object.CountOccurrence(userString.toLowerCase());
        
    }
}
