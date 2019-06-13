package com.Stack;

public class LinkedListImpl {

    private EmployeeNode head;
    private int size;

    public void push(Employee e){
        EmployeeNode en = new EmployeeNode(e);
        en.setNext(head);
        head = en;
        size++;
    }

    public Employee pop(){

        if ( head == null){
            System.out.println("LinkedList Stack is empty");
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;

        return removedNode.getEmployee();
    }

    public Employee peek(){

        if (head == null){
            System.out.println("LinkedList Stack is empty");
            return null;
        }else{
            System.out.println("\nPeeked Employee:" + head.getEmployee());
            return head.getEmployee();
        }
    }

    public  void printLinkedList(){
        System.out.println("\n");
        EmployeeNode current = head;

        while(current != null){
            System.out.println("Employee:" + current.getEmployee().toString());
            current = current.getNext();
        }
    }
}
