package com.List;

public class Main {

    public static void main(String[] args) {

        Employee one = new Employee("Nitin","Chauhan", 123);
        Employee two = new Employee("Mahendra","Chauhan", 456);
        Employee three = new Employee("Durgesh", "Chauhan", 789);
        Employee four = new Employee("Seeta","Chauhan", 111);
        Employee five = new Employee("Rinku","Chauhan",222);

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

        System.out.println("\n");
        doubleLinkedList.printLinkedList();

        // Remove
        System.out.println("\n");
        doubleLinkedList.removeHead();
        doubleLinkedList.removeTail();
        doubleLinkedList.removeHead();
        doubleLinkedList.removeHead();
        doubleLinkedList.removeTail();


        doubleLinkedList.printLinkedList();

    }


}