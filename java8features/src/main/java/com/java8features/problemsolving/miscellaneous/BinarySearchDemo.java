package com.java8features.problemsolving.miscellaneous;

import java.lang.reflect.Array;

public class BinarySearchDemo {
    public int search(int[] nums, int target) {

        int  start=0;
        int  end=nums.length-1;
        int  mid=(start+end)/2;
        if(target==nums[0])
        {
            return 0;
        }
        while(start<=end)
        {
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end= mid-1;
            }
            else if(target==nums[mid])
            {
                return mid;
            }
            mid=(start+end)/2;
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearchDemo binarySearchDemo=new BinarySearchDemo();
        int x[]={2,5};
        int search = binarySearchDemo.search(x, 5);
        System.out.println(search);
    }
}
