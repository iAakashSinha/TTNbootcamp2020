//Ques1: Write a programe do to demonstrate the use of volatile keyword.

import java.util.Scanner;
public class Ques1  {
        public static void main(String[] args) {
        NewThread obj = new NewThread();
        obj.start();
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        obj.setFlagFalse();
    }

}

class NewThread extends Thread{
    public volatile boolean flag = true;

    public void run(){

        while(flag){

            System.out.println("Flag is "+flag);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlagFalse(){
        flag = false;
    }
}