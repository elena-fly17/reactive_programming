package com.example.reactive_programming.subscribers;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

public class Subscriber_Task_2<T> extends BaseSubscriber<T> {

    Subscription mySubscription;

    @Override
    public void hookOnSubscribe(Subscription subscription) {
        this.mySubscription = subscription;
        subscription.request(5);
    }

    @Override
    public void hookOnNext(T t) {
        System.out.println(t);
        mySubscription.request(5);
    }

    @Override
    public void hookOnError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void hookOnComplete() {
        System.out.println("Done");
    }
}
