package com.heapsort_job_application;
import java.util.*;
public class HeapSort {
    //method which swap and create the heap in the array
    public static void heapify(int[] arr, int n, int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }
    }

    //method to build the heap on the array
    public static void buildHeap(int[] arr, int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    //method to heap sort
    public static void heapSort(int[] arr, int n){
        buildHeap(arr,n);
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

    //main method to control the flow of exection of the code of heap sort
    public static void main(String[] args){
        System.out.println("trying heapsort");
        int[] demandOfSalary = new int[]{5000,4000,6000,7000,8000,2000,1000,3000,5000,4000};
        System.out.print("The unsorted salary demand array : "+Arrays.toString(demandOfSalary));
        heapSort(demandOfSalary,demandOfSalary.length);
        System.out.println();
        System.out.print("The sorted array after heat sort is : "+Arrays.toString(demandOfSalary));
    }
}
