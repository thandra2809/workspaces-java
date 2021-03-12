package a.linkedlist;

public class LinkedListMain {
    public static void main(String args[]) {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);
        // Linked list will be
        // 2 -> 1 ->  7 -> 6 -> 5
        Node node = new Node();
        node.data = 1;
        myLinkedlist.deleteAfter(node);
        // After deleting node after 1,Linked list will be
        // 2 -> 1 -> 6 -> 5
        myLinkedlist.printLinkedList();
    }
}
