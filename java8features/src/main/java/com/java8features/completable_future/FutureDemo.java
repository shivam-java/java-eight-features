package com.java8features.completable_future;


import java.util.concurrent.*;

public class FutureDemo
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
       FutureDemo futureDemo=new FutureDemo();
        System.out.println(futureDemo.getSomeMessage());
    }

    String getSomeMessage() throws ExecutionException, InterruptedException {
        Callable<String> callable=()->"example of future";
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submit = executorService.submit(callable);
        executorService.shutdown();
        return submit.get();


    }



}
