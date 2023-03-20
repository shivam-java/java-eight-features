package com.java8features.overriding;

public class Demo
{
    public static void main(String[] args) {
        Cricket cricket=new Cricket();
        Cricket testCricket=new TestCricket();
        Cricket odiCricket=new ODICricket();
        System.out.println(odiCricket.getNumberOfOver());
        System.out.println(testCricket.getNumberOfOver());
        System.out.println(cricket.getNumberOfOver());
    }

}
