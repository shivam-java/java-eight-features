package com.java8features.problemsolving.linkedlist;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseDemo2 {

    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.reverseLinkedList();
        System.out.println(linkedList);
        int middleElement = linkedList.findMiddleElement();
        System.out.println(middleElement);


    }
}
