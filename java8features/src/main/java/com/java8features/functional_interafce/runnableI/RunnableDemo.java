package com.java8features.functional_interafce.runnableI;

public class RunnableDemo
{


    public static void main(String[] args) {
        Runnable runnable=()->
        {
            int i=0;
            while (i<10)
            {
                System.out.println("child thread..");
                i++;
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        int i=0;
        while (i<10)
        {
            System.out.println("parent thread");
            i++;
        }
    }
}
