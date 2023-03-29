package com.java8features.problemsolving.streamdemos.updatestudent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StudentDemoUsingLoop {


    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("aanchal","noida"));
        studentList.add(new Student("mayank","london"));
        studentList.add(new Student("aarya","banglore"));
        studentList.add(new Student("gokul","chennai"));
        studentList.add(new Student("aditya","noida"));
        UpdateStudent(studentList);

        System.out.println(studentList);
    }
    static int UpdateStudent(List<Student> studentList)
    {
        AtomicInteger count=new AtomicInteger();
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i).getCity().equals("noida"))
            {
                studentList.set(i,new Student(studentList.get(i).getName(),"lucknow"));
            }
        }
        return count.get();
    }
}
