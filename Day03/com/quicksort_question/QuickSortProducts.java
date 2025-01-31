package com.quicksort_question;
import java.util.*;
public class QuickSortProducts {

    //method to get the partition point of the array to set the pivot value to that position
    public static int partition(double[] arr, int low, int high){
        double pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                double t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        i++;
        double temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    //method to implement the quick sort from scratch
    public static void quicksort(double[] arr, int low, int high){
        if(low>=high) return;
        int pivot = partition(arr,low,high);
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1,high);

    }

    //main method to control the flow of execution
    public static void main(String[] args) {
        double[] productPrices = {999.99, 299.50, 799.00, 199.99, 399.75};

        quicksort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
