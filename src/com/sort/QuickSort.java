package com.sort;

public class QuickSort {

    public static void quickSort(int[] ary, int start, int end){

        if ( end - start < 2){
            return;
        }

        int pivotIndex = quick(ary,start,end);

        quickSort(ary,start, pivotIndex);
        quickSort(ary,pivotIndex + 1, end);

    }

    public static int quick(int[] ary, int start,int end){

        int pivot = ary[start];
        int i = start; // start
        int j = end; // end

        while ( i < j){

            //Empty loop
            while(i < j && ary[--j] > pivot){
            }

            if (i < j){
                ary[i] = ary[j];
            }

            //Empty loop
            while(i < j && ary[++i] < pivot){
            }

            if (i < j){
                ary[j] = ary[i];
            }
        }
        ary[j] = pivot;
        return j;

    }
}

