//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

public class Ques7 {

    static
    {
        System.out.println("using static block");
        System.out.println("FirstName : Aakash LastName : Sinha Age : 24");
    }
    public static String firstname = "aakash";
    public static String lastName = "sinha";
    public static int age = 24;

    public static void getDetails()
    {
        System.out.println("accessing using static method");

        System.out.println("firstname: "+firstname+ " lastName: "+lastName+ " age: "+age);
    }

    public static void main(String[] args)
    {
        System.out.println("accessing using static variables");
        System.out.println("firstname: "+firstname+ " lastName: "+lastName+ " age: "+age);
        getDetails();

    }
}
