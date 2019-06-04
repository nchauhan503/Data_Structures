package com.sort;

public class Array {

    public int[] SimpleArray(){
        int[] ary = new int[7];

        ary[0] = 20;
        ary[1] = -15;
        ary[2] = 9;
        ary[3] = 55;
        ary[4] = -1;
        ary[5] = 11;
        ary[6] = -50;

        return ary;
    }

    public int[] PlainArray(){
        int[] ary = new int[7];

        ary[0] = 2;
        ary[1] = 1;
        ary[2] = 2;
        ary[3] = 5;
        ary[4] = 3;
        ary[5] = 4;
        ary[6] = 7;

        return ary;
    }

    public int[] RadixArray(){
        int[] ary = new int[6];

        ary[0] = 4725;
        ary[1] = 5729;
        ary[2] = 1330;
        ary[3] = 4586;
        ary[4] = 8792;
        ary[5] = 1594;

        return ary;
    }
}
