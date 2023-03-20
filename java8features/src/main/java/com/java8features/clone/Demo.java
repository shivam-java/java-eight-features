package com.java8features.clone;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo implements Cloneable
{

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        Employee uttam = Employee.builder().name("uttam").salary("1500000").build();
        System.out.println(uttam);
        Object clone = uttam.clone();
        System.out.println(clone);

    }
}
