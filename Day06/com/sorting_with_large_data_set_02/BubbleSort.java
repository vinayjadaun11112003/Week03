package com.sorting_with_large_data_set_02;

public class BubbleSort {
    // BULLLE SORT ALGORITHM

    public static void bubblesort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }
}
