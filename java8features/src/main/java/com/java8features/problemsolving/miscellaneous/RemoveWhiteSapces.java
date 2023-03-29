package com.java8features.problemsolving.miscellaneous;

public class RemoveWhiteSapces {


    public static void main(String[] args) {
        String str="this is test ";
        System.out.println(str+"  "+str.length());
        String strip = str.strip();
        System.out.println(strip+" "+strip.length());
        String replace = str.replace(" ", "");
        System.out.println(replace);
    }
}
