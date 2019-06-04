package com.sort;

public class MergeSort {

    public void reverseMergeSort(int[] input, int start, int end){

        if(end - start < 2){
            return;
        }

        int mid = (end + start)/2;

        reverseMergeSort(input,start,mid);
        reverseMergeSort(input,mid,end);

        reverseMerge(input,start,mid,end);
    }


    public void reverseMerge(int[] input,int start,int mid,int end){

        if (input[mid - 1] > input[mid]){
            return;
        }

        int[] temp = new int[end - start];
        int tempIndex = 0;
        int i = start;
        int j = mid;

        while (i < mid && j < end){
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        if( i == mid){
            temp[tempIndex] = input[j];
        }else{
            temp[tempIndex] = input[i];
        }

        System.arraycopy(temp,0,input, start,end - start);

    }

    public void mergeSort(int[] input, int start, int end){

        if(end - start < 2){
            return;
        }

        int mid = (end + start)/2;

        mergeSort(input,start,mid);
        mergeSort(input,mid,end);

        merge(input,start,mid,end);
    }

    public void merge(int[] input,int start,int mid,int end){

        if (input[mid - 1] < input[mid]){
            return;
        }

        int[] temp = new int[end - start];
        int tempIndex = 0;
        int i = start;
        int j = mid;

        while (i < mid && j < end){
            temp[tempIndex++] = input[i] >= input[j] ? input[j++] : input[i++];
        }

        if( i == mid){
            temp[tempIndex] = input[j];
        }else{
            temp[tempIndex] = input[i];
        }

        System.arraycopy(temp,0,input, start,end - start);

    }
}
