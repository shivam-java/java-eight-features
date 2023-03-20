package com.java8features.collections.hashmap;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("shivam",1);
        hashMap.put("uttam",100000);
        hashMap.put(null,11);
        hashMap.put(null,12);
        hashMap.put("ravi",null);
        hashMap.put("ratnesh",null);
        System.out.println(hashMap);
        Hashtable<String,Integer> hashtable=new Hashtable<>();

    }
}
