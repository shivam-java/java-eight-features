package com.java8features.problemsolving.streamdemos.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void main(String[] args) {

            List<Student> studentList=new ArrayList<>();
            studentList.add(new Student("aakash",18));
            studentList.add(new Student("ambuj",25));
            studentList.add(new Student("ravi",28));
            List<Student> collect = studentList.stream().filter(s -> s.age > 18).collect(Collectors.toList());

        System.out.println(collect);
    }
}
