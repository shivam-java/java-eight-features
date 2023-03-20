package com.java8features.functional_interafce.custom_fi;

public class Demo {

    public static void main(String[] args) {
        FirstFI firstFI=v->v*v;
        System.out.println(firstFI.square(5));

    }
}
