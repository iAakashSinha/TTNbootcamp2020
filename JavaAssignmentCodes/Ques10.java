//Q10.Write a single program for following operation using overloading
//        A) Adding 2 integer number
//        B) Adding 2 double
//        C) multiplying 2 float
//        D) multiplying 2 int
//        E) concate 2 string
//        F) Concate 3 String

public class Ques10 {

    //        A) Adding 2 integer number
    public int overloadedFunction(Integer x, Integer y)
    {
        return (x + y);
    }

    //        B) Adding 2 double
    public double overloadedFunction(double x, double y)
    {
        return (x + y);
    }

    //        C) multiplying 2 float
    public float overloadedFunction(float x, float y)
    {
        return (x * y);
    }

    //        D) multiplying 2 int
    public int overloadedFunction(int x, int y)
    {
        return (x * y);
    }

    //        E) concate 2 string
    public String overloadedFunction(String x, String y)
    {
        return (x + y );
    }

    //        F) Concate 3 String
    public String overloadedFunction(String x, String y, String z)
    {
        return (x + y + z);
    }


    public static void main(String args[])
    {
        Integer integernum1 =10, integernum2=20;
        double doublenum1 =10.0, doublenum2 =20.0;
        float floatnum1 =10, floatnum2 =20;
        int intnum1 =10, intnum2 =20;
        String s1 = "hey ", s2= "there ", s3="world";

        Ques10 obj = new Ques10();

        //Integer Implementation
        System.out.println(obj.overloadedFunction(integernum1,integernum2));

        //Double Implementation
        System.out.println(obj.overloadedFunction(doublenum1, doublenum2));

        //Float Implementation
        System.out.println(obj.overloadedFunction(floatnum1, floatnum2));

        //int Implementation
        System.out.println(obj.overloadedFunction(intnum1, intnum2));

        //Two String Implementtion
        System.out.println(obj.overloadedFunction(s1,s3));

        //Three String Implementation
        System.out.println(obj.overloadedFunction(s1, s2, s3));

    }
}
