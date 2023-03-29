package com.java8features.problemsolving.miscellaneous;

import java.util.Arrays;
import java.util.Map;

public class ShuffleArrayDemo {


    public static void main(String[] args) {
        int arr[]={3,4,22,11,21,67};
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public  static void shuffleArray(int[] arr)
    {
        int random= (int)(Math.random()*10);
        System.out.println(random);
        if(arr.length<random)
        {
            random=random-arr.length-1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[random];
            arr[random]=arr[i];
            arr[i]=temp;
        }
    }
}
