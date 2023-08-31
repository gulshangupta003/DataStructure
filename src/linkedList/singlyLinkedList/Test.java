package linkedList.singlyLinkedList;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(11);
        list.insert(2);
        list.insert(32);
        list.insert(2);
        list.insert(90);
        list.insert(2);
        list.insert(90);

        list.printList();
        list.delete(2);
        list.printList();
    }
}
