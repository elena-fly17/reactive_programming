package com.example.reactive_programming.tasks;

import lombok.Data;
import reactor.core.publisher.Flux;

@Data
public class Task_4 {

    public void printNumbers(Flux<Integer> flux) {
        flux
                .subscribe(System.out::println)
                .dispose();
    }
}
