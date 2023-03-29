package com.java8features.problemsolving.miscellaneous.hashmapsort;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {

    public static void main(String[] args) {



        HashMap<Employee,String> employeeStringHashMap=new HashMap<>();
        Employee employee1=new Employee("aanchal",28,800000);
        Employee employee2=new Employee("aditya",27,900000);
        Employee employee3=new Employee("gokul",30,1800000);
        employeeStringHashMap.put(employee1,"mayank1");
        employeeStringHashMap.put(employee2,"mayank2");
        employeeStringHashMap.put(employee3,"mayank3");

        LinkedHashMap<Employee, String> collect = employeeStringHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect);
    }
}
