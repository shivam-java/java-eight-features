package com.java8features.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountDemo {

    public static void main(String[] args) {
        String str="rohitsharmaviratkohli";
        String[] split = str.split("");
        Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        /*
        Find All Duplicates
         */
        List<String> collect1 = collect.entrySet().stream().filter(i -> Integer.parseInt(String.valueOf(i.getValue())) > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(collect1);

    }
}
