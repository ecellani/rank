package com.hackerrank.datastructures.linkedlists;

public class InsertNodeAtTailOfLinkedList {

    Node Insert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null)
            return newNode;

        Node last = head.next;
        if (last == null) {
            head.next = newNode;
        } else {
            while (last.next != null)
                last = last.next;
            last.next = newNode;
        }
        return head;
    }

    public static void main(String... args) {
        InsertNodeAtTailOfLinkedList inatoll = new InsertNodeAtTailOfLinkedList();
        Node head = inatoll.Insert(new Node(1, new Node(2, new Node(3, null))), 4);
        System.out.println(head);
    }
}
