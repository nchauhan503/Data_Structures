package com.Stack;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Array
        ArrayImpl empArray = new ArrayImpl(5);

        Employee one = new Employee("Nitin","Chauhan", 123);
        Employee two = new Employee("Mahendra","Chauhan", 456);
        Employee three = new Employee("Durgesh", "Chauhan", 789);
        Employee four = new Employee("Seeta","Chauhan", 111);
        Employee five = new Employee("Rinku","Chauhan",222);
        Employee toAdd = new Employee("Harita","Chauhan",333);
        Employee toAddHead = new Employee("Jiyu","Chauhan",444);


        empArray.push(one);
        empArray.push(two);
        empArray.push(three);
        empArray.push(four);
        empArray.push(five);
        empArray.push(toAdd);
        empArray.push(toAddHead);

        empArray.pop();


        //LinkedList
        System.out.println("LinkedList Stack\n");
        LinkedListImpl ll = new LinkedListImpl();
        ll.push(one);
        ll.printLinkedList();
        ll.push(two);
        ll.printLinkedList();
        ll.push(three);
        ll.printLinkedList();
        ll.push(four);
        ll.printLinkedList();
        ll.push(five);
        ll.printLinkedList();
        ll.push(toAdd);
        ll.printLinkedList();
        ll.push(toAddHead);
        ll.printLinkedList();
        ll.peek();
        ll.printLinkedList();
        ll.pop();
        ll.printLinkedList();


        // Java Util Class
        LinkedList stack = new LinkedList<Employee>();
        stack.push(one);
        stack.peek();
        stack.push(two);
        stack.pop();


        System.out.println("\n Java Util Class Imp:" + stack.toString());


        //Stack Session Challenge Question
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
        // should return true
        System.out.println(checkForPalindrome("nitin"));

    }

    public static boolean checkForPalindrome(String string) {

        System.out.println("\nChecking for string:" + string);

        if(string == null || string == ""){
            return false;
        }

        LinkedList stringLinkedList = new LinkedList<Character>();


        string = string.replaceAll("[^A-Za-z]+", "").toUpperCase();

        for ( int i = 0; i < string.length();i++){
            stringLinkedList.push(string.charAt(i));
        }

        for ( int i = 0; i < string.length();i++){

            if(!stringLinkedList.peek().equals(string.charAt(i))){
                return false;
            }
            stringLinkedList.pop();
        }


        return true;
    }
}
