//Ques2: Write a program to create a thread using Thread class and Runnable interface each.

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("This is Main Thread ");
        System.out.println("Current Thread: "+ Thread.currentThread().getName());

        UsingRunnableInterface threadFromRunnable = new UsingRunnableInterface();
        Thread T = new Thread(threadFromRunnable);
        T.start();

        UsingThreadClass threadFromThreadClass = new UsingThreadClass();
        threadFromThreadClass.start();


    }
}

class UsingThreadClass extends Thread{

    public void run(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This Thread is spun using Thread class");
        System.out.println("Current Thread: "+ Thread.currentThread().getName());

    }
}

class UsingRunnableInterface implements Runnable{

    public void run(){

        System.out.println("This Thread is spun using Runnable Interface");
        System.out.println("Current Thread: "+ Thread.currentThread().getName());
    }
}
