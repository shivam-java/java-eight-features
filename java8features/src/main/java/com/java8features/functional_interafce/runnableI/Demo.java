package com.java8features.functional_interafce.runnableI;

public class Demo {

    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        int i=0;
        while (i<10)
        {
            System.out.println("parent thread");
            i++;
        }
    }
}
