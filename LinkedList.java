package com.company;

public class LinkedList {
    Node head;

    static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    public void delete(int data) {
        if(search(data)) {
            size--;
            if(head.data == data) {
                head = head.next;
                return;
            }
            Node currNode = head;
            while(currNode.next.data != data) {
                currNode = currNode.next;
            }
            Node temp = currNode.next.next;
            currNode.next = temp;

        }
    }

    public void insertAfter(int element, int data) {
        Node currNode = head;
        if (search(element)) {
            while (currNode.data != element) {
                currNode = currNode.next;
            }
            Node node1 = new Node(data);
            Node temp = currNode.next;
            currNode.next = node1;
            node1.next = temp;
        }
    }

    public void insertBetween(int element1, int element2, int data) {
        if (head == null || head.next == null) {
            return;
        }

        Node currNode = head;
        while (currNode.data != element1 || currNode.next.data != element2) {
            if (currNode.next.next == null) {
                break;
            }
            currNode = currNode.next;
        }
        if (currNode.data == element1 && currNode.next.data == element2) {
            Node newNode = new Node(data);
            Node temp = currNode.next;
            currNode.next = newNode;
            newNode.next = temp;
        }
    }

    public void ascOrder() {
        if(head == null) {
            return;
        }
        int exchanged =1;
        while(exchanged != 0) {
            Node currNode = head;
            exchanged = 0;
            while(currNode.next != null) {
                if(currNode.data > currNode.next.data) {
                    int temp =currNode.next.data;
                    currNode.next.data = currNode.data;
                    currNode.data = temp;
                    exchanged++;
                }
                currNode = currNode.next;
            }

        }
    }

    public boolean search(int data) {
        if (head == null) {
            return false;
        }
        Node currNode = head;
        while (currNode.data != data) {
            if (currNode.next == null) {
                return false;
            }
            currNode = currNode.next;
        }
        return true;
    }

    public int getSize() {
        System.out.println();
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "  ");
            currNode = currNode.next;
        }
    }
}
