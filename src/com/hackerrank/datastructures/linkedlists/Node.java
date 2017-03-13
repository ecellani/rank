package com.hackerrank.datastructures.linkedlists;

public class Node {
    public int data;
    public Node next;

    public Node() {}
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return data + " -->" + (next == null ? "NULL" : next.toString());
    }
}
