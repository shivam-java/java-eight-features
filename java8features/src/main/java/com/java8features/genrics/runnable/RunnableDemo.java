package com.java8features.genrics.runnable;

public class RunnableDemo<T extends Runnable>
{

}
class Test
{
    public static void main(String[] args) {
        RunnableDemo<Runnable> runnableRunnableDemo=new RunnableDemo<>();
        RunnableDemo<Thread> threadRunnableDemo=new RunnableDemo<>();
    }
}
