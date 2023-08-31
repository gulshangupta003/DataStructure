package linkedList.singlyLinkedList;

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
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void delete(int dataToDelete) {
        if (head == null)
            return;

        if (head.data == dataToDelete) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == dataToDelete) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }
}
