//Write a program to replace a substring inside a string with other string ?

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A String :");
        String String = sc.nextLine();
        System.out.println("Enter the substring to be replaced :");
        String replaceSubString = sc.nextLine();
        if(String.contains(replaceSubString)){
            System.out.println("enter a string to replace the substring : ");
            String replaceString = sc.nextLine();
            System.out.println("String after replacement : "+ String.replace(replaceSubString,replaceString));
        }
        else{
            System.out.println("String does not contains substring to be replaced ! Please try again");
        }

//        //Ques 3 hai ye
//        String str = "java is java again java again";
//        System.out.println("length of string is :" + str.length());
//        System.out.println(str.replace("j", "").length());
//        System.out.println(str.replace("j", ""));
//        int count = str.length() - str.replace("j", "").length();
//        System.out.println("Number of occurances of 'a' in "+str+" = "+count);
    }
}
