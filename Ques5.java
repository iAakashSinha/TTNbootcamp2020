//Ques 5: Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)

package com.tothenew.springbootcamp.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Ques5 {
    public static void main(String[] args) {
        ApplicationContext ac5 = SpringApplication.run(Ques3.class, args);

        Manager6 manager6 = ac5.getBean(Manager6.class);
        manager6.callDoWork();
    }

}

@Component
class Manager5{
    @Autowired
    Worker6 worker5;


    Manager5(Worker6 worker5){
        this.worker5 = worker5;
    }

    public void callDoWork(){
        worker5.doWork();
    }

}

interface Worker5{
    void doWork();
}

@Component
@Primary
class LazyWorker5 implements Worker6 {

    @Override
    public void doWork() {
        System.out.println("Lazy Worker of Question 5");
    }
}

@Component
class ExcellentWorker5 implements Worker6 {

    @Override
    public void doWork() {
        System.out.println("Excellent Worker of Question 5");
    }
}
