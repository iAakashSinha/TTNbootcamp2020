//Ques 3: WAP to produce ClassNotFoundException exception.

public class Ques3a {
    public static void main(String[] args) {

    ClassNotFoundExceptionClass cnfe = new ClassNotFoundExceptionClass();
    cnfe.cnfeEcample();
    }
}

class ClassNotFoundExceptionClass{
    public void cnfeEcample(){
        try
        {
            Class.forName("Aakash_test");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}


