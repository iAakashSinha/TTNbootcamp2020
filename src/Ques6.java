//Ques 6: Write a program to demonstrate sleep and join methods.

public class Ques6 extends Thread {

    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques6 t1=new Ques6();
        Ques6 t2=new Ques6();
        Ques6 t3=new Ques6();
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();

        }
        catch(Exception e){System.out.println(e);}

        t3.start(); //t3 thread starts with the t1 and t2 finish execution
    }
}