package com.example.reactive_programming.tasks;

import lombok.Data;
import reactor.core.publisher.Flux;

@Data
public class Task_3 {

    public void printOddNumbers(Flux<Integer> flux) {
        flux.filter(number -> number % 2 == 0)
                .subscribe(System.out::println);
    }
}
