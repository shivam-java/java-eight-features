package com.java8features.functional_interafce.comparator_fi.example_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Comparator<Student> comparator=(s1,s2)->s1.age>s2.age?1:s1.age<s2.age?-1:0;
        Collections.sort(studentArrayList,comparator);
        System.out.println(studentArrayList);
    }
}
