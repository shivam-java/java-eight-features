package com.java8features.functional_interafce.comparator_fi.example_one;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Comparator;

@AllArgsConstructor
@ToString
public class Student implements Comparable<Student>
{
    String name;
    int age;



    public int compareTo(Student student) {
      return this.age>student.age?1:this.age<student.age?-1:0;
    }
}
