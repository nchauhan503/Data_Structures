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
    }
}
