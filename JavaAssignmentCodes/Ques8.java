//Write a program to reverse a string and remove character from index 4 to index 9
// from the reversed string using String Buffer

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        StringBuffer strBuffer = new StringBuffer(str).reverse();
//        strBuffer.reverse();
        System.out.println("Reverse of Entered string is: "+strBuffer);

        strBuffer.replace(4,9,"");
        System.out.println(strBuffer);
    }
}
