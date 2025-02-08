package com.sorting_with_large_data_set_02;

import java.util.Random;
//SortingMain --> This class will control the execution of the program
public class SortingMain {
    public static void main(String[] args){
        //arr --> This array will store the size of the big datasets
        int[] arr = new int[]{1000,10000,1000000};

        //Creating random class object
        Random random = new Random();

        //Assigning random values to the array
        for(int i=0;i<arr.length;i++){
            int[] array = new int[arr[i]];
            for(int j=0;j<array.length;j++){
                array[i]=random.nextInt();
            }

            long starttime = 0;
            long endtime = 0;

            //Calculating time for each type of algorithm and then printing which one is faster amongs all
            starttime=System.nanoTime();
            BubbleSort.bubblesort(array);
            endtime=System.nanoTime();
            long timeBubbleSort=endtime-starttime;
            System.out.println("Time Taken in Performing BubbleSort : "+timeBubbleSort/1e6);

            starttime=System.nanoTime();
            MergeSort.mergesort(array,0,array.length-1);
            endtime=System.nanoTime();
            long timeMergeSort=endtime-starttime;
            System.out.println("Time Taken in Performing MergeSort : "+timeMergeSort/1e6);

            starttime=System.nanoTime();
            QuickSort.quicksort(array,0,array.length-1);
            endtime=System.nanoTime();
            long timeQuickSort=endtime-starttime;
            System.out.println("Time Taken in Performing QuickSort : "+timeQuickSort/1e6);

            System.out.println((timeMergeSort<timeQuickSort) ? (timeMergeSort<timeBubbleSort) ? "MergeSort is the fasted on performance on tha Dataset of "+(arr[i]) : "Bubble sort is the fastest in the performance on Dataset of "+(arr[i]) : "Quick Sort is the fasted on DataSet of "+(arr[i]));
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
