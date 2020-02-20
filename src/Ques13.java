//Ques 13: Create a custom exception that do not have any stack trace.

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) throws HandMadeException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Press Enter to throw Exception");
            sc.nextLine();
            throw new HandMadeException("This is a Custom Exception");
        }
        catch (HandMadeException hme){
            System.out.println(hme.getMessage());
            System.out.println(hme.getStackTrace());
        }

    }
}


class HandMadeException extends Exception{
    public HandMadeException(String message){
        super(message);
    }
}