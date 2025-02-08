package com.searching_with_large_data_set_01;

public class LinearSearchLargeData {
    public static int linearSearch(int[] array, int target){
        //Linear Search algorithm
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
