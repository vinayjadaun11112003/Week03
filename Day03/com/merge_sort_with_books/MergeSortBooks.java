package com.merge_sort_with_books;

import java.util.*;

public class MergeSortBooks {

    //method to implement the merge sort algorithm from scratch
    public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    //method to merge the sorted part of the recursive subarray
    public static void merge(double[] arr, int low, int mid, int high) {
        int right=mid+1;
        int left=low;
        ArrayList<Double> l = new ArrayList<>();
        while(low<=mid && right<=high){
            if(arr[low]<=arr[right]){
                l.add(arr[low]);
                low++;
            }else{
                l.add(arr[right]);
                right++;
            }
        }
        while(low<=mid){
            l.add(arr[low]);
            low++;
        }
        while(right<=high){
            l.add(arr[right]);
            right++;
        }
        for(int i=0;i<l.size();i++){
            arr[left+i]=l.get(i);
        }
    }

    //main method to control the flow of code
    public static void main(String[] args) {
        double[] bookPrices = {499.99, 299.50, 799.00, 199.99, 399.75};

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(bookPrices));
    }

}
