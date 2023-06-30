package com.example.reactive_programming.tasks;

import com.example.reactive_programming.subscribers.Subscriber_Task_2;
import lombok.Data;
import reactor.core.publisher.Flux;

@Data
public class Task_2 {

    public void processFiveElements(Flux<Integer> flux) {

        Subscriber_Task_2<Integer> mySubscriber = new Subscriber_Task_2<>();
        flux.subscribeWith(mySubscriber);
    }
}
