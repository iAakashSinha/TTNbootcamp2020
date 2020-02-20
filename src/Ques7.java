//Ques 7: WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int n = sc.nextInt();

        int days = n / (24*3600);
        n = n % (24*3600);
        int hour = n / 3600;
        n = n % 3600;
        int min = n / 60;
        n = n % 60;

        System.out.println("The days:"+days);
        System.out.println("The hours:"+hour);
        System.out.println("The minutes:"+min);
        System.out.println("The seconds:"+n);
    }
}
