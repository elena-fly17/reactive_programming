package com.example.reactive_programming;

import com.example.reactive_programming.tasks.Task_1;
import com.example.reactive_programming.tasks.Task_2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactiveProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveProgrammingApplication.class, args);

		Flux<Integer> flux = Flux.range(1, 10);

//		Task_1 task_1 = new Task_1();
//		task_1.incrementIfMoreThenFive(flux);

		Task_2 task_2 = new Task_2();
		task_2.processFiveElements(flux);
	}
}
