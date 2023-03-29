package com.java8features.problemsolving.streamdemos.mapping;

import java.util.List;
import java.util.stream.Collectors;

public class MappingDemo {



    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        List<String> collect = integers.stream().map(e -> e + "new").collect(Collectors.toList());
        System.out.println(collect);
    }
}
