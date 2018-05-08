package com.mytest;

public class MyNode {
    private int key;
    private MyNode next;

    public MyNode(int key) {
        this.key = key;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public static MyNode ReverseList(MyNode head) {
        MyNode p, q;
        p = head.next;
        while (p.next != null)//在这个循环过程中p所指的元素一直是不变的
        {
            q = p.next;
            p.next = q.next;
            q.next = head.next;
            head.next = q;
        }
        p.next = head;//相当于成环
        head = p.next.next; //新head变为原head的next
        p.next.next = null;//断掉环
        return head;
    }

    public static String convertString(MyNode myNode) {
        StringBuffer sb = new StringBuffer();
        while (myNode != null) {
            sb.append(myNode.key);
            myNode = myNode.next;
        }
        return sb.toString();
    }
}