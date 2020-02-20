//Write a program to create a Thread pool of 2 threads where one Thread will print even numbers
// and other will print odd numbers.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 to print Even Number is running");
                for(int i=0;i<10;i+=2){
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 to print Odd Number is running");
                for(int i=1;i<10;i+=2){
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executorService.shutdown();
    }
}