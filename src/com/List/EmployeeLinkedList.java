package com.List;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    //Adding at the front
    public void add(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    //Removing from the front
    public EmployeeNode remove(){

        if (head == null){
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;

        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public  void printLinkedList(){

        EmployeeNode current = head;

        while(current != null){
            System.out.println("Employee:" + current.getEmployee().toString());
            current = current.getNext();
        }
    }
}
