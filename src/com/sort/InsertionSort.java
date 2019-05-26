package com.sort;

import java.util.Arrays;

public class InsertionSort {

    public int[] sortArray(int[] insertion){

        System.out.println("\nInput for Insertion Sort: " + Arrays.toString(insertion));

        int unpartitionedIndex = insertion.length;


        for (int i = 1; i < unpartitionedIndex; i++){
            int target = insertion[i];
            int index = 0;
            for ( int j = i ; j > 0 ; j--){
                if( insertion[j - 1] > target) {
                    insertion[j] = insertion[j - 1];

                }else{
                    index = j;
                    break;
                }
            }
            insertion[index] = target;
        }

        System.out.println("\nOutput for insertion Sort: " + Arrays.toString(insertion));
        return insertion;
    }

    public static void swap(int[] ary, int i, int j){

        if ( i == j){
            return ;
        }

        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;

        return;
    }
}
