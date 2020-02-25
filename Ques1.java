//Write the following a functional interface and implement it using lambda:
//
//(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value        Parameter (int) Return int
//(3) Concatination of 2 string                                     Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                    Parameter (String) Return (String)


package Java8InterfaceExercise;

@FunctionalInterface
interface CompareInterface{
    boolean iCompare(Integer i1, Integer i2);
}

@FunctionalInterface
interface IncrementInterface{
    Integer increament(Integer i1);
}

@FunctionalInterface
interface ConcatInterface{
    String concat(String s1, String s2);
}

@FunctionalInterface
interface ToUpperCaseInterface{
    String toUpperCase(String s1);
}

public class Ques1 {
    public static void main(String[] args) {

//(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean

        CompareInterface compareInterface = (i1,i2)->{
            if(i1>i2)
                return true;
            else
                return false;

        };
        System.out.println(compareInterface.iCompare(10,20));

//(2) Increment the number by 1 and return incremented value        Parameter (int) Return int
        IncrementInterface incrementInterface =(i1)->{
          return   i1+=1;
        };
        System.out.println("Incremented Value : "+incrementInterface.increament( 10));

//(3) Concatination of 2 string                                     Parameter (String , String ) Return (String)
        ConcatInterface concatInterface = (String::concat);
        System.out.println("Concatinated String : "+ concatInterface.concat("Helo ", "World"));

//(4) Convert a string to uppercase and return .                    Parameter (String) Return (String)
        ToUpperCaseInterface toUpperCaseInterface = (String::toUpperCase);
        System.out.println(toUpperCaseInterface.toUpperCase("aakash sinha"));
    }
}
