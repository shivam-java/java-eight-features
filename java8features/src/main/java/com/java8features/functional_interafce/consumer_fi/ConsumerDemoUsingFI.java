package com.java8features.functional_interafce.consumer_fi;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemoUsingFI

{
    public static void main(String[] args) {
        Consumer consumer=(t)-> System.out.println(t);
        consumer.accept("10");
        consumer.accept(10);

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        integers.stream().forEach(consumer);
    }

}
