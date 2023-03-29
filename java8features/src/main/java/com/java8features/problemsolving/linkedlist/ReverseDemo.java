package com.java8features.problemsolving.linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseDemo {

    public static void main(String[] args) {
        List<Integer> integerList=new LinkedList<>();
        integerList.add(2);
        integerList.add(21);
        integerList.add(22);
        integerList.add(24);
        List<Integer> collect = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
