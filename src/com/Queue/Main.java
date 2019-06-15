package com.Queue;

public class Main {

    public static void main(String[] args){

        Employee one = new Employee("Nitin","Chauhan", 123);
        Employee two = new Employee("Mahendra","Chauhan", 456);
        Employee three = new Employee("Durgesh", "Chauhan", 789);
        Employee four = new Employee("Seeta","Chauhan", 111);
        Employee five = new Employee("Rinku","Chauhan",222);
        Employee toAdd = new Employee("Harita","Chauhan",333);
        Employee toAddHead = new Employee("Jiyu","Chauhan",444);

        ArrayImpl arrayImpl = new ArrayImpl(5);

        arrayImpl.enQueue(one);

        arrayImpl.enQueue(two);

        arrayImpl.deQueue();

        arrayImpl.deQueue();
        arrayImpl.deQueue();
        arrayImpl.peek();

        //Circular array implementation
        System.out.println("\n Circular Array Queue Implementation");
        CircularArrayImpl circularArrayImpl = new CircularArrayImpl(5);

        circularArrayImpl.enQueue(one);

        circularArrayImpl.enQueue(two);

        circularArrayImpl.deQueue();

        circularArrayImpl.deQueue();
        circularArrayImpl.deQueue();
        circularArrayImpl.peek();

        circularArrayImpl.enQueue(three);
        circularArrayImpl.enQueue(four);
        circularArrayImpl.enQueue(five);
        circularArrayImpl.peek();
        circularArrayImpl.enQueue(toAdd);
        circularArrayImpl.enQueue(toAddHead);
        circularArrayImpl.peek();

        circularArrayImpl.printQueue();
    }
}
