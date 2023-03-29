package com.java8features.default_methods_interface;

public interface Cricket {



    public default void numberOfOvers()
    {

        System.out.println("Depends on the format");
    }
    void numberOfplyers();
}
