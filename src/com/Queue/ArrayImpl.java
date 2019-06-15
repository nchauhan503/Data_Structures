package com.Queue;


public class ArrayImpl {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayImpl(int capacity){
        queue = new Employee[capacity];
    }

    public void enQueue(Employee e){
        System.out.println("\nEnqueuing");
        if ( back == queue.length){
            //resize the array
            Employee[] reSizeArrray = new Employee[2 * queue.length];
            System.arraycopy(queue,0,reSizeArrray,0,queue.length);
            queue = reSizeArrray;
            System.out.println("Resizing the array");
        }

        queue[back++] = e;
        printQueue();
    }

    public Employee deQueue(){

        System.out.println("\nDequeuing");
        if ( back - front == 0){
            System.out.println("Empty queue");
            return null;
        }

        Employee removedNode;

        removedNode = queue[front++];
        queue[front - 1] = null;

        System.out.println("\nRemoved node is: " + removedNode);


        if ( back - front == 0){
            front = 0;
            back = 0;
        }

        return removedNode;
    }

    public Employee  peek(){

        System.out.println("\nPeeking");
        if ( back - front == 0){
            System.out.println("Empty queue");
            return null;
        }

        System.out.println("Output for peek: " + queue[front]);
        return queue[front];

    }

    public void printQueue(){

        for (int i = front; i < back; i++ ){

            System.out.println("Queue: " + queue[i]);
        }
    }

}
