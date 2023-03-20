package com.java8features.functional_interafce.comparator_fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CDemo {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(21);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(4);
        MyComparator myComparator=new MyComparator();
        Collections.sort(arrayList,myComparator);
        System.out.println(arrayList);
    }
}
