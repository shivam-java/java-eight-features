package com.java8features.recorddemo;

public class RecordDemo {
    public record Employee(String name)
    {

    }

    public static void main(String[] args) {
        Employee employee=new Employee("akash");
        String name = employee.name();
        System.out.println(name);
    }

}
