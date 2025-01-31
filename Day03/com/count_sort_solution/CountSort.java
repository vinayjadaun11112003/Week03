package com.count_sort_solution;

import java.util.Arrays;
//method to implement the countsort algorithm from scratch
public class CountSort {
    public static void countSort(int[] arr, int n){
        //getting the max element to make the size of the new count array
        int maxElement=arr[0];
        for(int i=0;i<n;i++){
            maxElement=Math.max(maxElement,arr[i]);
        }
        //setting each value of count to zero
        int[] count = new int[maxElement+1];

        //counting the count of element
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //cummalative sum
        for(int i=1;i<=maxElement;i++){
            count[i]+=count[i-1];
        }

        //storing element to its actual position
        int[] output = new int[n];
        for(int i=0;i<n;i++){
            output[--count[arr[i]]]=arr[i];
        }

        //setting value in the original value of array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    //main method to control the flow of code
    public static void main(String[] args){
        int[] studentAge = new int[]{4,5,7,5,6,3,1,4,5,5,7,2,4};
        System.out.println("Student age array : "+ Arrays.toString(studentAge));
        countSort(studentAge,studentAge.length);
        System.out.println("student's age after sorting through  : "+Arrays.toString(studentAge));
    }
}
