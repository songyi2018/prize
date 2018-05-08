package com.mytest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyNode head = new MyNode(1);
        MyNode node1 = new MyNode(2);
        MyNode node2 = new MyNode(3);
        head.setNext(node1);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(null);

        System.out.print("原始数据：");
        System.out.print(MyNode.convertString(head));
        MyNode myNode = MyNode.ReverseList(head);
        System.out.print("倒置后：");
        System.out.print(MyNode.convertString(myNode));
    }
}
