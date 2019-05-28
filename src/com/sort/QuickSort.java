package com.sort;

public class QuickSort {

    public static void quickSort(int[] ary){

        int pivot = ary[0];
        int j = ary.length; // end
        int i = 0; // start

        while ( i < j){
            if (ary[--j] < pivot){
                ary[i++] = ary[j];
            }
            if(ary[i] > pivot){
                ary[j--] = ary[i];
            }
        }

        ary[i] = pivot;
        //return ary;
    }
}

