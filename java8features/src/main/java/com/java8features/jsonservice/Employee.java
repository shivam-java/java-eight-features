package com.java8features.jsonservice;

import lombok.*;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {

    long empid;
    String empname;
    String salary;
    String address;
}
