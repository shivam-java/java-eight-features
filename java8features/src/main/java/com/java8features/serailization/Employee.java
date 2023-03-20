package com.java8features.serailization;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@AllArgsConstructor
@Builder
public class Employee implements Serializable
{
    String name;
    String salary;

    public static void main(String[] args) throws IOException {
        Employee uttam = Employee.builder().name("uttam").salary("1500000").build();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("src/main/resources/employee.cer"));
        objectOutputStream.writeObject(uttam);
        objectOutputStream.close();


    }
}
