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

        //Recursion Insertion Sort
        array = arrays.SimpleArray();
        System.out.println("\nInput for Recursion Insertion Sort: " + Arrays.toString(array));
        insertionSort.recursionInsertionSort(array,array.length);
        System.out.println("\nOutput for Recursion Insertion Sort: " + Arrays.toString(array));

        //Shell Sort
        array = arrays.SimpleArray();
        ShellSort shellSort = new ShellSort();
        shellSort.sortArray(array);

        //Merge Sort
        array = arrays.SimpleArray();
        System.out.println("\n Input for Merge Sort: " + Arrays.toString(array));
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,0,array.length);
        System.out.println("\n Increasing Output for Merge Sort: " + Arrays.toString(array));

        mergeSort.reverseMergeSort(array,0,array.length);
        System.out.println("\n Decreasing Output for Merge Sort: " + Arrays.toString(array));


        //Quick Sort
        array = arrays.SimpleArray();
        System.out.println("\n Input for Quick Sort: " + Arrays.toString(array));
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length);
        System.out.println("\n Output for Quick Sort: " + Arrays.toString(array));

        //Counting Sort
        array = arrays.PlainArray();
        System.out.println("\n Input for Counting Sort: " + Arrays.toString(array));
        CountingSort countingSort = new CountingSort();
        countingSort.countingSort(array);
        System.out.println("\n Output for Counting Sort: " + Arrays.toString(array));

        //Radix Sort
        // Implement after doing linkedList
        array = arrays.RadixArray();
        System.out.println("\n Input for Radix Sort: " + Arrays.toString(array));
        RadixSort radixSort = new RadixSort();
        radixSort.RadixSort(array);
        System.out.println("\n Output for Radix Sort: " + Arrays.toString(array));
    }
}
