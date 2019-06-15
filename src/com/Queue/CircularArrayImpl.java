package com.Queue;


public class CircularArrayImpl {

    private Employee[] queue;
    private int front;
    private int back;

    public CircularArrayImpl(int capacity){
        queue = new Employee[capacity];
    }

    public void enQueue(Employee e){
        System.out.println("\nEnqueuing");
        if ( size() == queue.length - 1){
            //resize the array
            Employee[] reSizeArrray = new Employee[2 * queue.length];
            System.arraycopy(queue,front,reSizeArrray,0,queue.length - front);
            if( back != queue.length - 1) {
                System.arraycopy(queue, 0, reSizeArrray, queue.length - front, back);
            }
            back = queue.length - 1;
            front = 0;
            queue = reSizeArrray;

            System.out.println("Resizing the array");
        }

        queue[back] = e;


        if ( back == queue.length - 1){
            back = 0;
        }else{
            back++;
        }

        printQueue();
    }

    public Employee deQueue(){

        System.out.println("\nDequeuing");
        if ( size() == 0 || back == front){
            System.out.println("Empty queue");
            back = 0;
            front = 0;
            return null;
        }

        Employee removedNode;

        removedNode = queue[front++];
        queue[front - 1] = null;

        if(front == queue.length){
            front = 0;
        }

        System.out.println("\nRemoved node is: " + removedNode);


        if ( size() == 0){
            front = 0;
            back = 0;
        }

        return removedNode;
    }

    public Employee  peek(){

        System.out.println("\nPeeking");
        if ( size() == 0){
            System.out.println("Empty queue");
            return null;
        }

        System.out.println("Output for peek: " + queue[front]);
        return queue[front];

    }

    public int size(){
        if ( back > front){
            return back -front;
        }else{
            return queue.length - ( front  - back);
        }

    }

    public void printQueue(){

        if(back > front) {

            for (int i = 0 ; i < queue.length; i++) {

                System.out.println("Queue: " + queue[i]);
            }
        }else{
            for (int i = front; i < queue.length; i++) {

                System.out.println("Queue: " + queue[i]);
            }
            for (int i = 0; i < front; i++) {

                System.out.println("Queue: " + queue[i]);
            }

        }
    }

}
