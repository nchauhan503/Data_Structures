package com.HashTable;

import com.common.Employee;

public class ProbingHashTable {
    private Employee[] hashtable;

    public ProbingHashTable(){
        hashtable = new Employee[10];
    }

    private int hashKey(String name){

        return name.length()%hashtable.length;
    }

    public void put(String name, Employee employee){

        if ( hashtable[hashKey(name)] != null){
            System.out.println("\nThe key " + hashKey(name) + " is already being used: " + name);
        }else {
            hashtable[hashKey(name)] = employee;
        }
    }

    public Employee get(String name){
        return hashtable[hashKey(name)];
    }

    public void printAll(){
        for (int i = 0; i < hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }

}
