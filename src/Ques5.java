//WAP to show object cloning in java using cloneable and copy constructor both.

import java.lang.Cloneable;

public class Ques5 implements Cloneable{
    int number;
    String str;

    Ques5(int number , String str){
        this.number = number;
        this.str= str;
    }

    Ques5(Ques5 obj){
        System.out.println("Copy Constructor called!!!");
        number= obj.number;
        str= obj.str;

    }

    public Object clone()throws CloneNotSupportedException{
        System.out.println("Clone function Called !!!");

        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        try{


        Ques5 originalObject1 = new Ques5(1,"Aakash");
            System.out.println(originalObject1.number+" " + originalObject1.str);

        Ques5 cloneableObject2 = (Ques5) originalObject1.clone();
            System.out.println(cloneableObject2.number+" " + cloneableObject2.str);

        Ques5 copyConstructorObject3 =new Ques5(originalObject1);
            System.out.println(copyConstructorObject3.number+" " + copyConstructorObject3.str);

        }
        catch (CloneNotSupportedException cnse){}


    }
}
