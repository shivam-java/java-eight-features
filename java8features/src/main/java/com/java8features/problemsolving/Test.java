package com.java8features.problemsolving;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {

       int nums[]={1,1,2};
        nums = removeArray(nums);
        System.out.println(Arrays.toString(nums));
        HashSet hashSet=new HashSet<>();
        //Collections.sort(nums,Comparator.comparing());
    }

    static int[] removeArray(int[] nums)
    {

        nums= Arrays.stream(nums).boxed().collect(Collectors.toSet()).stream().mapToInt(e->e).toArray();
return nums;
    }
    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {
        System.out.println("String argument");
    }
    public static void foo(StringBuffer s) {
        System.out.println("StringBuffer argument");
    }
}
