//Write a program to demonstrate wait and notify methods.

public class Ques5 {
    public static void main(String[] args) {
        WaitNotifyDemo waitNotifyDemo = new WaitNotifyDemo();
        new Thread(() -> {
            waitNotifyDemo.methodOne();
        }).start();
        new Thread(() -> {
            waitNotifyDemo.methodTwo();
        }).start();
    }
}

class WaitNotifyDemo {

    public void methodOne() {
        synchronized (this) {
            System.out.println("Method 1 Started");
            try {
                wait();
                System.out.println("Method 1 Ended--------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void methodTwo() {
        System.out.println("Method 2 Started");
        System.out.println("Method 2 Ended*************");
        notify();
    }

}