package com.sorting_with_large_data_set_02;

public class QuickSort {


    //QUICK SORT ALGORITHM


    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low<high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

}
