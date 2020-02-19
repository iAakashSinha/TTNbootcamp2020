//WAP showing try, multi-catch and finally blocks.

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {

        TryCatch obj1 = new TryCatch();
        obj1.tryCatch();

    }

}

class TryCatch
{
    public void tryCatch()
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Number Format Exception " + ex);
        }
        finally {
            System.out.println("This is Finally Block.");
        }
    }
}