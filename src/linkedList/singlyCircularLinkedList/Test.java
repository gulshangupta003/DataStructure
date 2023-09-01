package linkedList.singlyCircularLinkedList;

public class Test {
    public static void main(String[] args) {
        SinglyCircularLinkedList list = new SinglyCircularLinkedList();

        list.insert(3);
        list.insert(4);
        list.insert(1);
        list.insert(22);
        list.insert(32);
        list.insert(8);
        list.insert(9);
        list.insert(77);
        list.insert(12);

        list.printList();
    }
}
