package com.sort;


import java.util.Arrays;

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

        //Shell Sort
        array = arrays.SimpleArray();
        ShellSort shellSort = new ShellSort();
        shellSort.sortArray(array);

        //Merge Sort
        array = arrays.SimpleArray();
        System.out.println("\n Input for Merge Sort: " + Arrays.toString(array));
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,0,array.length);
        System.out.println("\nOutput for Merge Sort: " + Arrays.toString(array));
    }
}
