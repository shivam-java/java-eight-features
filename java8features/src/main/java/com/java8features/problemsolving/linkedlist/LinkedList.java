package com.java8features.problemsolving.linkedlist;

import lombok.ToString;

@ToString
public class LinkedList {

    Node head;
    public void add(int data)
    {
        Node node=new Node();
        node.data=data;
        if(head==null) {
            head = node;
        }
        else
        {
            Node node1=head;
            while (node1.next!=null)
            {
                node1=node1.next;
            }
            node1.next=node;

        }
    }
    public void reverseLinkedList()
    {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
       // prev=head;
        head=prev;


    }

    public int findMiddleElement()
    {

        Node current = head;
        Node middle = head;
        int length=0;
        while (current.next!= null) {
            length++;
            if(length%2==0)
            {
                middle=middle.next;
            }
            current=current.next;

        }
        if(length%2==1)
        middle=middle.next;
      return middle.data;


    }

}
