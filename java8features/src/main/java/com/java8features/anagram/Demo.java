package com.java8features.anagram;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

   static String input[]={"cat","cta","dog","god"};

    public static void main(String[] args) {

        List<List<String>> collect = Arrays.stream(input).collect(Collectors.groupingBy(w -> sorted(w))).entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());

        System.out.println(collect);

    }
    public static String sorted(String x)
    {
        /*

         Sort Using Stream
        String[] split = x.split("");
        List<String> strings = Arrays.asList(split);
        Collections.sort(strings);
        String collect = strings.stream().collect(Collectors.joining());
        return collect;

         */
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
