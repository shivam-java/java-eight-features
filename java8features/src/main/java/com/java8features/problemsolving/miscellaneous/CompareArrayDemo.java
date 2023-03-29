package com.java8features.problemsolving.miscellaneous;





import java.util.Arrays;
import java.util.HashSet;

public class CompareArrayDemo {

    public static void main(String[] args) {

        int arr1[]={2,5};
        int arr2[]={5,2,1};

        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);
        CompareArrayDemo compareArrayDemo=new CompareArrayDemo();
        System.out.println("With Method "+compareArrayDemo.compareArray(arr1,arr2));


    }

    public boolean compareArray(int[] arr1,int[] arr2)
    {
        HashSet hs1=new HashSet();
        HashSet hs2=new HashSet();
        Arrays.stream(arr1).forEach(e-> hs1.add(e));
        Arrays.stream(arr2).forEach(e-> hs2.add(e));
        if(hs1.equals(hs2))
        {
            return true;
        }
        return false;
    }
}
