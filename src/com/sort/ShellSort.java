package com.sort;

import java.util.Arrays;

public class ShellSort {

    public int[] sortArray(int[] shell){

        System.out.println("\nInput for Shell Sort: " + Arrays.toString(shell));

        int unpartitionedIndex = shell.length;
        int gap = (int)Math.floor(shell.length/2);

        while( gap > 0) {
            for (int i = gap; i < unpartitionedIndex; i++) {
                int target = shell[i];
                int index = i;
                for (int j = i; j > 0; j = j - gap) {
                    if (shell[j - gap] > target) {
                        shell[j] = shell[j - gap];
                        index = j - gap;
                    } else {
                        break;
                    }
                }
                shell[index] = target;

                if (i == shell.length - 1) {
                    gap = (int) Math.floor((double) gap / 2);
                }
            }
        }

        System.out.println("\nOutput for shell Sort: " + Arrays.toString(shell));
        return shell;
    }

}
