package com.hackerrank.datastructures.linkedlists;

public class InsertNodeAtSpecificPositionInLinkedList {

    Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null)
            return newNode;

        Node previous = null;
        for (int i = 0; i < position; i++) {
            if (position == i) {

            }
            if (previous == null)
                previous = head;
            else
                previous = previous.next;
        }

        return head;
    }

    public static void main(String... args) {

    }
}
