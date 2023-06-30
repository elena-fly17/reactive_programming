package com.example.reactive_programming.tasks;

import lombok.Data;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

@Data
public class Task_2 {

    Subscription mySubscription;

    // вариант с использованием современного метода subscribeWith
//    public void processFiveElements(Flux<Integer> flux) {
//
//        Subscriber_Task_2<Integer> mySubscriber = new Subscriber_Task_2<>();
//        flux.subscribeWith(mySubscriber);
//    }

    // вариант с использованием устаревшей вариации метода subscribe (его варианта,
    // принимающего 4 параметра)
    public void processFiveElements(Flux<Integer> flux) {

        flux.subscribe(
                value -> {
                    System.out.println(value);
                    mySubscription.request(5);
                },
                error -> System.out.println(error.getMessage()),
                () -> System.out.println("Done"),
                subscription -> {
                    this.mySubscription = subscription;
                    subscription.request(5);
                }
        );
    }
}
