package com.hackerrank.datastructures.linkedlists;

public class PrintElementsLinkedList {

    void Print(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        if (head.next != null) Print(head.next);
    }

    public static void main(String... args) {
        PrintElementsLinkedList pell = new PrintElementsLinkedList();
        pell.Print(new Node(1, new Node(2, new Node(3, null))));
    }
}
