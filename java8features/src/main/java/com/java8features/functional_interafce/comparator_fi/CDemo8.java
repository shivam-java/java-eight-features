package com.java8features.functional_interafce.comparator_fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CDemo8 {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(21);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(4);
        Comparator<Integer> comparator=(o1, o2) -> o1>o2?1:o1<o2?-1:0;

        Collections.sort(arrayList);
        System.out.println("Default Sorting"+arrayList);
        Collections.sort(arrayList,comparator);
        System.out.println(arrayList);

        arrayList.stream().forEach(System.out::println);

        Object collect = arrayList.stream().collect(Collectors.toList());
        System.out.println(collect);
    }
}
