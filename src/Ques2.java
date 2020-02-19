//Ques 2: WAP for sorting string without using string Methods?.

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String original = sc.nextLine();
        int j = 0;
        char temp = 0;

        char[] chars = original.toLowerCase().toCharArray();

        for (int i = 1; i < chars.length; i++) {
//                if(chars[i]==' '){
//                    chars[i]='';
//                }
            for (j = 0; j < chars.length; j++) {
//                if(chars[j]==' '){
//                    continue;
//                }
                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }

            }

        }

        for (int k = 0; k < chars.length; k++) {
            if(chars[k]==' '){
                continue;
            }
            System.out.print(chars[k]);
            System.out.print(" ");
        }

    }

}
