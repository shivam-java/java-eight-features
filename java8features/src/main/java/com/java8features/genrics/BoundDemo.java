package com.java8features.genrics;

import lombok.ToString;

@ToString
public class BoundDemo<T extends Number> {

    T obj;
   BoundDemo(T obj)
   {
       this.obj=obj;
   }
  void show ()
  {
      System.out.println(obj.getClass().getName());
  }

    public static void main(String[] args) {
       /*
       This will  Show err as we are bounding Type with number
        */
//        BoundDemo<String> demo1=new BoundDemo<String>("yes");
//        System.out.println(demo1);
    //    demo1.show();
        BoundDemo<Integer> demo2=new BoundDemo<Integer>(10);
        System.out.println(demo2);
        demo2.show();
        BoundDemo<Double> demo3=new BoundDemo<Double>(10.0);
        System.out.println(demo3);
        demo3.show();

    }
}
