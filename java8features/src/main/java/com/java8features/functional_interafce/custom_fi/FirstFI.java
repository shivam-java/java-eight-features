package com.java8features.functional_interafce.custom_fi;

public interface FirstFI {

   int square(int n);
   default void welcomeMsg()
   {
      System.out.println("welcome to FI");
   }
}
