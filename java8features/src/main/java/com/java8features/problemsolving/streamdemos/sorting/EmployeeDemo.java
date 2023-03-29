package com.java8features.problemsolving.streamdemos.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {


    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        List<String> lisofnames = List.of("uttam", "shivam", "aakash");
        employeeList.add(new Employee("uttam",100));
        employeeList.add(new Employee("shivam",300));
        employeeList.add(new Employee("satyam",200));
        List<String> collect1 = lisofnames.stream().sorted().collect(Collectors.toList());
        List<Employee> collect = employeeList.stream().sorted((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).collect(Collectors.toList());
        List<Employee> collect2 = employeeList.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName())).collect(Collectors.toList());

        /*

     Collections.sort(employeeList,(e1,e2)->e2.getName().compareTo(e1.getName()));

      */
        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);
    }
}
