package com.java8features.method_reference;

public class Demo {
    public static void main(String[] args) {
        Interf interf=ProduceMsg::getMsg;
        interf.getMsg();
        Runnable runnable=ProduceMsg::threadTask;
        Thread thread=new Thread(runnable);
        thread.start();
        /*
        For non static method we use object to call method

         */
        ProduceMsg produceMsg=new ProduceMsg();
        Interf interf1=produceMsg::getMsgWithObjectReference;
        interf1.getMsg();
    }
}
