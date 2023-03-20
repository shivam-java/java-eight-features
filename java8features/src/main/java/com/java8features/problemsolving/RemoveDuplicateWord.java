package com.java8features.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String str="no one can match the intensity of the king kohli kohli";
        String[] s = str.split(" ");
        List<String> collect = Arrays.stream(s).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
