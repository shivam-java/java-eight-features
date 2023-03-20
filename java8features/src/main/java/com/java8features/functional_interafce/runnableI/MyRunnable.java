package com.java8features.functional_interafce.runnableI;

import java.util.List;

public class MyRunnable implements Runnable
{


    @Override
    public void run()
    {
        int i=0;
        while (i<10)
        {
            System.out.println("child thread");
            i++;
        }
    }
}
