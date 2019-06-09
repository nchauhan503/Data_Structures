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

    public void addBefore(Employee add, Employee before){
        EmployeeDoubleNode current = head;

        while(current != null){

            if (current.getEmployee().equals(before)){
                if ( head.getEmployee().equals(tail.getEmployee()) || head.getEmployee().equals(before)){
                    //only one element or adding at the head level, addHead method will take care of it
                    addHead(add);
                }else{
                    //adding between head and tail
                    EmployeeDoubleNode toAdd = new EmployeeDoubleNode(add);
                    EmployeeDoubleNode beforeAdd = current.getPrevious();

                    beforeAdd.setNext(toAdd);
                    toAdd.setPrevious(beforeAdd);

                    toAdd.setNext(current);

                    current.setPrevious(toAdd);
                    size++;
                    break;

                }
            }

            current = current.getNext();
        }
    }
}
