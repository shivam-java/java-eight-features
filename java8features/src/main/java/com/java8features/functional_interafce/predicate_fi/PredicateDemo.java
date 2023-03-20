package com.java8features.functional_interafce.predicate_fi;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<Integer> predicate=t->t%2==0;
        System.out.println(predicate.test(10));
        List<Integer> integers = List.of(2, 3, 8, 9, 11);
        integers.stream().filter(predicate).forEach(System.out::println);

        System.out.println(integers);
    }
}
