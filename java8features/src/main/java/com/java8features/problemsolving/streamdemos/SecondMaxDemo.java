package com.java8features.problemsolving.streamdemos;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMaxDemo {

    public static void main(String[] args) {


        List<Integer> integers = List.of(2, 3, 11, 22, 1, 6);
        Optional<Integer> first = integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }
}
