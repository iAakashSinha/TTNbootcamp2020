//Ques1: Write a program to demonstrate Tightly Coupled code.

package springFrameworkExercise;

public class Ques1 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.func();
    }
}


class Manager{

    Worker worker = new LazyWorker();

    public void func(){
        worker.doWork();
    }


}

interface Worker{
    public void doWork();

}

class LazyWorker implements Worker{

    @Override
    public void doWork() {
        System.out.println("This is a Lazy Worker of Ques 1");
    }
}