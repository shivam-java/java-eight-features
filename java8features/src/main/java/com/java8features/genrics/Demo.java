package com.java8features.genrics;

import lombok.ToString;

import java.util.ArrayList;
@ToString
public class Demo<T> {

    T obj;
   Demo(T obj)
   {
       this.obj=obj;
   }
  void show ()
  {
      System.out.println(obj.getClass().getName());
  }

    public static void main(String[] args) {
        Demo<String> demo1=new Demo<String>("yes");
        System.out.println(demo1);
        demo1.show();
        Demo<Integer> demo2=new Demo<Integer>(10);
        System.out.println(demo2);
        demo2.show();
        Demo<Double> demo3=new Demo<Double>(10.0);
        System.out.println(demo3);
        demo3.show();

    }
}
