//Ques2: Write a program to demonstrate Loosely Coupled code.
package springFrameworkExercise;

public class Ques2 {
    public static void main(String[] args) {
        new Manager2(new LazyWorker2()).func();
//        manager2.func();
    }
}


class Manager2{

    Worker2 worker2;

    Manager2(Worker2 worker2){
        this.worker2 = worker2;
//        func();
    }

    public void func(){
        worker2.doWork();
    }


}

interface Worker2{
    public void doWork();

}

class LazyWorker2 implements Worker2{

    @Override
    public void doWork() {
        System.out.println("This is a Lazy Worker of Ques 2");
    }
}