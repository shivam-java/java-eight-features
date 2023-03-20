package com.java8features.serailization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("src/main/resources/employee.cer"));
        Employee o = (Employee) objectInputStream.readObject();
        System.out.println(o.name);
        System.out.println(o.salary);

    }
}
