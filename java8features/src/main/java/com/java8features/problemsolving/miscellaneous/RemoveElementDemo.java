package com.java8features.problemsolving.miscellaneous;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementDemo {

    public static void main(String[] args) {
        List<String> list = List.of("uttam", "shivam", "adarsh");
        List<String> collect = list.stream().skip(2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
