package com.Stack;

import java.util.Arrays;

public class ArrayImpl {

    private Employee[] stack;
    private int top;

    public ArrayImpl(int capacity){
        stack = new Employee[capacity];
    }

    //pop method
    public Employee pop(){

        //Stack is empty
        if(top == 0){
            return null;
        }
        Employee a = stack[--top];
        stack[top] = null;
        System.out.println("\nOutput for POP: " + a);

        return a;
    }

    //push method
    public void push(Employee a){
        if ( top == stack.length){
            //resize the array
            Employee[] reSizeArrray = new Employee[2 * stack.length];
            System.arraycopy(stack,0,reSizeArrray,0,stack.length);
            stack = reSizeArrray;
        }
        stack[top++] = a;

        System.out.println("\nOutput for Push: " + Arrays.toString(stack));
    }

    //peek method
    public Employee peek(){

        //Stack is empty
        if(top == 0){
            System.out.println("\n Stack is empty");
            return null;
        }

        System.out.println("\nPeek Value: " + stack[top-1]);
        return stack[top];
    }
}
