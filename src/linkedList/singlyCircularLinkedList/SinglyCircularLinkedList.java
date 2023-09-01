package linkedList.singlyCircularLinkedList;

import linkedList.Node;

public class SinglyCircularLinkedList {
    Node head, tail;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data);
            if (temp.next != head)
                System.out.print(" -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
