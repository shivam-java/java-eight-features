package com.java8features.functional_interafce.consumer_fi;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer>

{
    @Override
    public void accept(Integer integer) {
        System.out.println("Printing "+integer);
    }

    public static void main(String[] args) {
        ConsumerDemo consumerDemo=new ConsumerDemo();
        consumerDemo.accept(10);
    }
}
