package com.java8features.constructor_refrence;

public class Demo {
    public static void main(String[] args) {
        Interf interf=Student::new;
        Student student = interf.getStudent();
        student.display();


    }
}
