package com.sorting_with_large_data_set_02;

import java.util.ArrayList;

public class MergeSort {

    //MERGE SORT ALGORITHM


    public static void merge(int[] arr,int low,int mid,int high){
        int right=mid+1;
        int left=low;
        ArrayList<Integer> l = new ArrayList<>();
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

    public static void mergesort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
