package com.java8features.method_reference;

public class ProduceMsg
{



    public static void getMsg() {
        System.out.println("this method is called by method reference");
    }
    public  void getMsgWithObjectReference() {
        System.out.println("this method is called by method reference with object");
    }
    public static void threadTask() {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
