package com.java8features.functional_interafce.comparator_fi.example_four;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Employee implements Comparable<Employee>
{

    String name;
    int salary;

    @Override
    public int compareTo(Employee o) {
        int salComparision= this.salary>o.getSalary()?1:this.salary<o.getSalary()?-1:0;
        if(salComparision==0)
        {
            return this.getName().compareTo(o.getName());
        }
        return salComparision;
    }
}
