package com.java8features.problemsolving.miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StringCharsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog", "god","dgo");

        boolean isSameSet=true;
        for(int i=1;i<list.size();i++)
        {
            char[] chars = list.get(0).toCharArray();
            Arrays.sort(chars);
            char[] second = list.get(i).toCharArray();
            Arrays.sort(second);
            if(Arrays.equals(chars,second))
            {

            }
            else
            {
                isSameSet=false;
            }

        }
        System.out.println(isSameSet);


    }
}
