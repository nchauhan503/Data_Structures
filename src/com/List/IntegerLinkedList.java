package com.List;

import com.List.IntegerNode;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        IntegerNode newElement = new IntegerNode(value);
        IntegerNode current = head;

        //Adding first element
        if(head == null || current.getValue() >= value ){
            addToFront(value);
            return;
        }

        while(current != null){

            //Checking if current node's value is less than newElement's value
            if(current.getValue() < value){

                //Checking if current's next element is null
                // implying it is the last element in the list
                if (current.getNext() == null || current.getNext().getValue() > value){
                    newElement.setNext(current.getNext());
                    current.setNext(newElement);
                    size++;
                    return;
                }
            }

            current = current.getNext();
        }
        return;


    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}