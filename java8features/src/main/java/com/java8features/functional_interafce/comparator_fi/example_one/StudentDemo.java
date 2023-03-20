package com.java8features.functional_interafce.comparator_fi.example_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {


    public static void main(String[] args) {
        Student student1=new Student("shivam",25);
        Student student2=new Student("bhaiya",28);
        Student student3=new Student("anurag",24);
        ArrayList<Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);
    }
}
