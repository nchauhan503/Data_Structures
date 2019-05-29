package com.sort;

public class CountingSort {

    public static int[] countingSort(int[] ary){

        int min = 1000000;
        int max = 0;

        for (int i = 0 ; i < ary.length ; i++){
            if ( ary[i] < min){
                min = ary[i];
            }

            if ( ary[i] > max){
                max = ary[i];
            }
        }


        int[] cts = new int[max - min + 1];

        for (int i = 0 ; i < ary.length ; i++){
            cts[ ary[i] - min]++;
        }

        int counter = 0;
        for (int i = 0 ; i < cts.length ; i++){
            if (cts[i] > 0){
                int value = min + i;
                for (int j = 0; j < cts[i] ;j++){
                    ary[counter++] = value;

                }
            }
        }

        return ary;

    }
}
