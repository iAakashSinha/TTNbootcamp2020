//Ques3: Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management


package com.tothenew.springbootcamp.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Ques3 {

	public static void main(String[] args) {
		ApplicationContext ac3 = SpringApplication.run(Ques3.class, args);
		Manager3 manager3 = ac3
				.getBean(Manager3.class);
		manager3.abc();


	}

}

@Component
class Manager3{

	@Autowired
	Worker3 worker3;

	public void abc(){
		worker3.doWork();
	}


}

interface Worker3{
	void doWork();
}

@Component
class LazyWorker3 implements Worker3{

	@Override
	public void doWork() {
		System.out.println("Lazy Worker of Question3");
	}
}
