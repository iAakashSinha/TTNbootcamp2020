//Ques 4: Get a Spring Bean from application context and display its properties.

package com.tothenew.springbootcamp.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

public class Ques4 {
    public static void main(String[] args) {
        ApplicationContext ac4 = SpringApplication.run(Ques3.class, args);
        Manager4 manager4 = ac4.getBean(Manager4.class);
        System.out.println(manager4.property1);


    }
}

@Component
class Manager4{

    int property1 = 100;


    @Autowired
    Worker4 worker4;

    public void abc(){
        worker4.doWork();
    }


}

interface Worker4{
    void doWork();
}

@Component
class LazyWorker4 implements Worker4{

    @Override
    public void doWork() {
        System.out.println("Lazy Worker of Question4");
    }
}
