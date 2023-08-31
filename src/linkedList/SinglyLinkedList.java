package linkedList;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
     }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(11);
        list.insert(2);
        list.insert(32);
        list.insert(90);

        list.printList();
    }
}
