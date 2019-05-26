package com.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Simple array creation
        Array arrays = new Array();
        int[] array = arrays.SimpleArray();

        //Bubble Sort
        //BubbleSort bubbleSort = new BubbleSort();
        //bubbleSort.sortArray(array);

        //Selection Sort
        array = arrays.SimpleArray();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortArray(array);
    }
}
