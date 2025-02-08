package com.searching_with_large_data_set_01;

public class BinarySearchLargeData {
    public static int binarySearch(int[] array,int target){
        //Binary Search Algorithm
        int low = 0;
        int high = array.length;
        int mid=-1;
        while(low<=high){
             mid = (low+(high-low)/2);
            if(array[mid]==target){
                return mid;
            }else if(array[mid]>target && mid<array.length){
                high=mid-1;
            }else if(array[mid]<target && mid<array.length){
                low=mid+1;
            }
        }
        return mid;
    }
}
