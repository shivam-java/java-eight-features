package com.java8features.functional_interafce;

import java.util.function.Function;

public class Demo {

    public static void main(String[] args) {
        Function<Integer,Integer> function=i->i*i;
        System.out.println(function.apply(4));
        System.out.println(function.apply(5));
    }
}
