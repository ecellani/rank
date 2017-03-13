package com.hackerrank.datastructures.linkedlists;

public class InsertNodeAtHeadOfLinkedList {

    Node Insert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null)
            return newNode;
        newNode.next = head;
        return newNode;
    }

    public static void main(String... args) {
        InsertNodeAtHeadOfLinkedList inaholl = new InsertNodeAtHeadOfLinkedList();
        Node node = inaholl.Insert(new Node(2, null), 1);
        System.out.println(node.toString());
    }
}
