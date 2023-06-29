package com.example.reactive_programming.tasks;

import lombok.Data;
import reactor.core.publisher.Flux;

@Data
public class Task_1 {

    public void incrementIfMoreThenFive(Flux<Integer> flux) {

        flux.map(number -> {
                    if (number > 5) {
                        return number + 1;
                    } else {
                        throw new IllegalArgumentException("Error: " + number + "< than 5");
                    }
                })
                .onErrorContinue((e, item) -> System.out.println(e.getMessage()))
                .subscribe(
                        System.out::println,
                        error -> System.out.println(error.getMessage())
                );
    }
}
