package com.java8features.optional_demo;

import java.util.Optional;
import java.util.function.Function;

public class Demo {



    public static void main(String[] args) {
        String str="Hello";
        Optional<String> str1 = Optional.ofNullable(str);
        System.out.println(str1.orElse("The value is null"));

    }
}
