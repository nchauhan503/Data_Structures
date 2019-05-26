package com.sort;


public class Main {

    public static void main(String[] args) {
        // Simple array creation
        Array arrays = new Array();
        int[] array = arrays.SimpleArray();

        //Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(array);

        //Selection Sort
        array = arrays.SimpleArray();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortArray(array);

        //Insertion Sort
        array = arrays.SimpleArray();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortArray(array);
    }
}
