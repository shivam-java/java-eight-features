package com.java8features.functional_interafce.comparator_fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CDemoTest1 {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(21);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(4);
        Comparator<Integer> myComparator=(o1, o2) ->{return o1%10>o2%10?1:o1%10<o2%10?-1:0;};

        Collections.sort(arrayList,myComparator);
        System.out.println(arrayList);
    }
}
