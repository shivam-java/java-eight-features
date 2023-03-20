package com.java8features.clone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@AllArgsConstructor
@Builder
@ToString
public class Employee implements Cloneable
{
    String name;
    String salary;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
