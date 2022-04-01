package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.addLast(56);
        list.addLast(70);
        list.addLast(30);
        list.addLast(40);
        list.ascOrder();
        list.printList();
        System.out.println(list.search(100));
        System.out.println("Size of linked list is: " +list.getSize());
    }
}
