package com.java8features.problemsolving.streamdemos.updatestudent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StudentDemo {


    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("aanchal","noida"));
        studentList.add(new Student("mayank","london"));
        studentList.add(new Student("aarya","banglore"));
        studentList.add(new Student("gokul","chennai"));
        studentList.add(new Student("aditya","noida"));
        AtomicInteger count=new AtomicInteger();
        studentList=studentList.stream().map(s->
                {
                    if(s.getCity().equals("noida"))
                    {
                        count.getAndIncrement();
                        return new Student(s.getName(),"lucknow");
                    }
                    return s;
                }
        ).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
