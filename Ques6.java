//Ques 6:Perform Constructor Injection in a Spring Bean

package com.tothenew.springbootcamp.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Ques6 {
    public static void main(String[] args) {
        ApplicationContext ac6 = SpringApplication.run(Ques3.class, args);

        Manager6 manager6 = ac6.getBean(Manager6.class);
        manager6.callDoWork();
    }

}

@Component
class Manager6 {
    @Autowired
    Worker6 worker6;


    Manager6(Worker6 worker5){
        this.worker6 = worker5;
    }

    public void callDoWork(){
        worker6.doWork();
    }

}

interface Worker6 {
    void doWork();
}

@Component
class LazyWorker6 implements Worker6 {

    @Override
    public void doWork() {
        System.out.println("Lazy Worker of Question 6");
    }
}


