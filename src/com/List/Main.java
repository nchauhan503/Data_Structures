package com.List;

public class Main {

    public static void main(String[] args) {

        Employee one = new Employee("Nitin","Chauhan", 123);
        Employee two = new Employee("Mahendra","Chauhan", 456);
        Employee three = new Employee("Durgesh", "Chauhan", 789);
        Employee four = new Employee("Seeta","Chauhan", 111);
        Employee five = new Employee("Rinku","Chauhan",222);
        Employee toAdd = new Employee("Harita","Chauhan",333);
        Employee toAddHead = new Employee("Jiyu","Chauhan",444);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.add(one);
        list.add(two);
        list.add(three);

        list.printLinkedList();
        System.out.println("\nSize of the linkedList is:" + list.getSize());

        EmployeeNode removed = list.remove();
        System.out.println("\nRemovedNode is:" + removed.getEmployee().toString());

        list.printLinkedList();
        System.out.println("\nSize of the linkedList after removing:" + list.getSize());


        EmployeeDoubleLinkedList doubleLinkedList = new EmployeeDoubleLinkedList();

        //Add
        doubleLinkedList.addTail(one);
        doubleLinkedList.addHead(two);
        doubleLinkedList.addHead(three);
        doubleLinkedList.addHead(four);
        doubleLinkedList.addTail(five);

        System.out.println("\n");
        doubleLinkedList.printLinkedList();

        //Challenge 1 starts
        System.out.println("\n Add Before");
        doubleLinkedList.addBefore(toAdd,two);
        doubleLinkedList.printLinkedList();

        System.out.println("\n Add Before Head");
        doubleLinkedList.addBefore(toAddHead,four);
        doubleLinkedList.printLinkedList();
        // Challenge 1 ends

        // Remove
        System.out.println("\n Removing some elements");
        doubleLinkedList.removeHead();
        doubleLinkedList.removeTail();
        doubleLinkedList.removeHead();
        doubleLinkedList.removeHead();
        doubleLinkedList.removeTail();


        doubleLinkedList.printLinkedList();

        //Challenge 2 starts
        System.out.println("\n Challenge 2\n");
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        Integer e = 5;

        IntegerLinkedList listInt = new IntegerLinkedList();
        listInt.insertSorted(1);
        listInt.insertSorted(2);
        listInt.insertSorted(3);


        listInt.insertSorted(c);
        listInt.printList();
        listInt.insertSorted(b);
        listInt.printList();
        listInt.insertSorted(a);
        listInt.printList();
        listInt.insertSorted(e);
        listInt.printList();
        listInt.insertSorted(d);
        listInt.printList();

        // Challenge 2 ends

        //Reverse the linkedList
        System.out.println("\n Reverse LinkedList");
        IntegerNode newHead = reverseLinkedList(listInt.getHead());
        while ( newHead != null) {
            System.out.println(newHead.getValue() + "\n");
            newHead = newHead.getNext();
        }

    }

    private static IntegerNode reverseLinkedList(IntegerNode node) {

        if (node.getNext() == null) {
            return node;
        }

        IntegerNode ret = reverseLinkedList(node.getNext());

        node.getNext().setNext(node);
        node.setNext(null);
        return ret;
    }



}