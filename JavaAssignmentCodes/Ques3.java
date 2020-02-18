//Write a program to find the number of occurrences of a character in a string without using loop?


import java.util.Scanner;

public class Ques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("enter a char ");
        String aChar = sc.nextLine();
        System.out.println("length of string is :" + str.length());
//        System.out.println(str.replace("a", "").length());
//        System.out.println(str.replace("j", ""));
        int count = str.length() - str.replace(aChar, "").length();
        System.out.println("Number of occurances of 'a' in "+str+" = "+count);
    }
}
