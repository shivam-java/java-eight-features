package com.java8features.problemsolving.streamdemos.sorting;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Employee {

    String name;
    int salary;
}
