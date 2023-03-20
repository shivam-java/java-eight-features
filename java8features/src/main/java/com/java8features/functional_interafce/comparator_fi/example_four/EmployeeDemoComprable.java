package com.java8features.functional_interafce.comparator_fi.example_four;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemoComprable {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("satyam",100));
        employeeList.add(new Employee("uttam",300));
        employeeList.add(new Employee("anurag",100));
        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}
