package com.compare_different_ds_for_searching_06;


public class ArraySearch {
    //Searching in array method
    public static boolean searchArray(int[] array,int inputSize,int target){
        for(int i=0;i<inputSize;i++){
            if(array[i]==target) return true;
        }
        return false;
    }
}
