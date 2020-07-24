package lesson2;

import lesson2.arraylist.ArrayList;
import lesson2.arraylist.SimplArrayList;
import lesson2.linkedlist.LinkedList;
import lesson2.linkedlist.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        testSimpleArrayList();
        testSimpleLinkedList();
    }

    private static void testSimpleArrayList() {
        System.out.println("Array");
        ArrayList<Integer> array = new SimplArrayList<>(5);

        array.add(5);
        array.add(2);
        array.add(4);
        array.add(1);
        array.add(3);
        array.add(8);

        array.display();

        System.out.println("Find 1: " + array.indexOf(1));
        System.out.println("Find 5: " + array.indexOf(5));
        System.out.println("Find 8: " + array.indexOf(8));
        System.out.println("Find 111: " + array.indexOf(111));
        System.out.println("___Array___");
    }

    private static void testSimpleLinkedList() {
        System.out.println("LinkedList");
        LinkedList<Integer> linkedList = new SimpleLinkedList<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);

        System.out.println("Contains 2: " + linkedList.contains(2));
        System.out.println("Remove 2: " + linkedList.remove(2));
        System.out.println("Contains 2: " + linkedList.contains(2));
        System.out.println("Remove 2: " + linkedList.remove(2));

        System.out.println("Size is " + linkedList.size());
        linkedList.display();

        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.removeFirst());
        }
        System.out.println("___LinkedList___");
    }
}
