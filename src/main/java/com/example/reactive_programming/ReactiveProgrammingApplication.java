package com.example.reactive_programming;

import com.example.reactive_programming.tasks.Task_1;
import com.example.reactive_programming.tasks.Task_2;
import com.example.reactive_programming.tasks.Task_3;
import com.example.reactive_programming.tasks.Task_4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactiveProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveProgrammingApplication.class, args);

		Flux<Integer> flux = Flux.range(1, 10);

		// проверка работы метода из Task_1
//		Task_1 task_1 = new Task_1();
//		task_1.incrementIfMoreThenFive(flux);

		// проверка работы метода processFiveElements (из Task_1) с использованием
		// современного метода subscribeWith
//		Task_2 task_2 = new Task_2();
//		task_2.processFiveElements(flux);

		// проверка работы метода processFiveElements (иизTask_2) с использованием
		// устаревшей вариации метода subscribe, принимающего 4 параметра
//		Task_2 task_2 = new Task_2();
//		task_2.processFiveElements(flux);

		// проверка работы метода из Task_3
//		Task_3 task_3 = new Task_3();
//		task_3.printOddNumbers(flux);

		// проверка работы метода из Task_4
		Task_4 task_4 = new Task_4();
		task_4.printNumbers(flux);
	}
}
