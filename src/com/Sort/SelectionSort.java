package com.Sort;

import java.util.Arrays;

public class SelectionSort {

    public int[] sortArray(int[] selection){

        System.out.println("\nInput for Selection Sort: " + Arrays.toString(selection));

        int unpartitionedIndex = selection.length - 1;
        int largetIndex = 0;

        for (int i = 0; i < unpartitionedIndex; i++){

            if(selection[i] > selection[largetIndex]) {
                largetIndex = i;
            }

            if (i == unpartitionedIndex - 1  && i > 0){
                swap(selection, largetIndex, unpartitionedIndex);
                unpartitionedIndex--;
                largetIndex = 0;
                i = -1;
            }
        }
        System.out.println("\nOutput for Selection Sort: " + Arrays.toString(selection));
        return selection;
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
