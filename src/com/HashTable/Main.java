package com.HashTable;

import com.common.Employee;

public class Main {

    public static void main(String[] args){
        System.out.println("\nHashtable");

        Employee one = new Employee("Nitin","Chauhan", 123);
        Employee two = new Employee("Mahendra","Chauhan", 456);
        Employee three = new Employee("Durgesh", "Chauhan", 789);
        Employee four = new Employee("Seeta","Chauhan", 111);
        Employee five = new Employee("Rinku","Chauhan",222);
        Employee toAdd = new Employee("Harita","Chauhan",333);
        Employee toAddHead = new Employee("Jiyu","Chauhan",444);

        SimpleHashTable simpleHashTable = new SimpleHashTable();

        simpleHashTable.put(one.getFirstName(), one);
        simpleHashTable.put(two.getFirstName(),two);
        simpleHashTable.put(four.getFirstName(),four);
        System.out.println("\n" + simpleHashTable.get("Nitin") + "\n");

        simpleHashTable.printAll();


    }
}
