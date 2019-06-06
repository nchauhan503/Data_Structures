package com.Sort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sortArray(int[] bubble){

        System.out.println("\nInput for Bubble Sort: " + Arrays.toString(bubble));

        int unpartitionedIndex = bubble.length - 1;

        for (int i = 0; i < unpartitionedIndex; i++){

            if(bubble[i] > bubble[i + 1]){
                swap(bubble, i, i + 1);
            }

            if (i == unpartitionedIndex - 1 ){
                unpartitionedIndex--;
                i = -1;
            }
        }

        System.out.println("\nOutput for Bubble Sort: " + Arrays.toString(bubble));
        return bubble;
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
