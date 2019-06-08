package com.List;

public class EmployeeDoubleLinkedList {

    private EmployeeDoubleNode head;
    private EmployeeDoubleNode tail;
    private int size;

    //Adding at the head
    public void addHead(Employee employee){

        EmployeeDoubleNode employeeDoubleNode = new EmployeeDoubleNode(employee);

        if(head == null){
            tail = employeeDoubleNode;
        }else {
            head.setPrevious(employeeDoubleNode);
            employeeDoubleNode.setNext(head);
        }

        head = employeeDoubleNode;
        size++;
    }

    //Adding at the head
    public void addTail(Employee employee){

        EmployeeDoubleNode employeeDoubleNode = new EmployeeDoubleNode(employee);

        if (tail == null){
            head = employeeDoubleNode;
        }else {
            tail.setNext(employeeDoubleNode);
            employeeDoubleNode.setPrevious(tail);
        }

        tail = employeeDoubleNode;
        size++;
    }
    
    //Removing from the front
    public EmployeeDoubleNode removeHead(){

        if (head == null){
            return null;
        }

        EmployeeDoubleNode removedNode = head;
        head = head.getNext();
        if (head == null){
            tail = null;
        }else {
            head.setPrevious(null);
        }
        removedNode.setNext(null);
        removedNode.setPrevious(null);
        size--;

        return removedNode;
    }

    //Removing from the end
    public EmployeeDoubleNode removeTail() {

        if (tail == null) {
            return null;
        }

        EmployeeDoubleNode removedNode = tail;
        tail = tail.getPrevious();
        if (tail == null) {
            head = null;
        } else{
            tail.setNext(null);
        }
        removedNode.setNext(null);
        removedNode.setPrevious(null);
        size--;

        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public  void printLinkedList(){

        EmployeeDoubleNode current = head;

        while(current != null){
            System.out.println("Employee:" + current.getEmployee().toString());
            current = current.getNext();
        }
    }
}
