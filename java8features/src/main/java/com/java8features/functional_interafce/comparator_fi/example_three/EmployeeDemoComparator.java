package com.java8features.functional_interafce.comparator_fi.example_three;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemoComparator {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("satyam",100));
        employeeList.add(new Employee("uttam",300));
        employeeList.add(new Employee("anurag",100));

        employeeList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        System.out.println(employeeList);
    }
}
