package com.List;

public class Main {

    public static void main(String[] args) {

        Employee one = new Employee("Nitin","Chauhan", 123);
        Employee two = new Employee("Mahendra","Chauhan", 456);
        Employee three = new Employee("Durgesh", "Chauhan", 789);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.add(one);
        list.add(two);
        list.add(three);

        list.printLinkedList();
        System.out.println("Size of the linkedList is:" + list.getSize());

        EmployeeNode removed = list.remove();
        System.out.println("RemovedNode is:" + removed.getEmployee().toString());

        list.printLinkedList();
        System.out.println("Size of the linkedList after removing:" + list.getSize());
    }


}