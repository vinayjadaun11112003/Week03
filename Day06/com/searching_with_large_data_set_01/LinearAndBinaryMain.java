package com.searching_with_large_data_set_01;

//Class Controller --> This will control the execution of other classes and methods
public class LinearAndBinaryMain {
    //Main method --> This will control the flow of code.
    public static void main(String[] args){
        //LargeData1 Array --> Array with size of 1000
        int[] largeData1 = new int[1000];



        //Assigning i+2 value in a loop to the Array
        for(int i=0;i<1000;i++){
            largeData1[i]=i+2;
        }


        //Performing the Linear Search on Large Data set of size 1000
        long starttime = System.nanoTime();
        int index=LinearSearchLargeData.linearSearch(largeData1,4);
        System.out.println(index>0? "Index found at "+index : "Index not found");;
        long endtime = System.nanoTime();
        long linearSearchTime = endtime-starttime;
        System.out.println("Time Taken to Perform Linear Search in the Large Data 1000 : "+(linearSearchTime));


        //Performing the Binary Search on Large Data set of size 1000
        starttime = System.nanoTime();
        index=BinarySearchLargeData.binarySearch(largeData1,4);
        System.out.println(index>0? "Index found at "+index : "Index not found");
        endtime = System.nanoTime();
        long binarySearchTime = endtime-starttime;
        System.out.println("Time Taken to Perform Binary Search in the Large Data 1000 : "+(binarySearchTime));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        //Printing which is faster
        System.out.println((linearSearchTime>binarySearchTime) ? "\nBinary Search is Faster" : "\n\nLinear Search is Faster");




//------------------------------------------------------------------------------------------------------------------------------------------------------------------





        //LargeData1 Array --> Array with size of 1000
        int[] largeData2 = new int[10000];

        //Assigning i+2 value in a loop to the Array
        for(int i=0;i<10000;i++){
            largeData2[i]=i+2;
        }

        //Performing the Linear Search on Large Data set of size 10000
        starttime = System.nanoTime();
        index=LinearSearchLargeData.linearSearch(largeData2,4);
        System.out.println(index>0? "\n\n\nIndex found at "+index : "\n\n\nIndex not found");;
        endtime = System.nanoTime();
        linearSearchTime = endtime-starttime;
        System.out.println("Time Taken to Perform Linear Search in the Large Data 10000 : "+(linearSearchTime));


        //Performing the Binary Search on Large Data set of size 10000
        starttime = System.nanoTime();
        index=BinarySearchLargeData.binarySearch(largeData2,4);
        System.out.println(index>0? "Index found at "+index : "Index not found");
        endtime = System.nanoTime();
        binarySearchTime = endtime-starttime;
        System.out.println("Time Taken to Perform Binary Search in the Large Data 10000 : "+(binarySearchTime));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        //Printing which is faster
        System.out.println((linearSearchTime>binarySearchTime) ? "\nBinary Search is Faster" : "\n\nLinear Search is Faster");




        //------------------------------------------------------------------------------------------------------------------------------------------------------------------




        //LargeData1 Array --> Array with size of 1000
        int[] largeData3 = new int[1000000];

        //Assigning i+2 value in a loop to the Array
        for(int i=0;i<1000000;i++){
            largeData3[i]=i+2;
        }

        //Performing the Linear Search on Large Data set of size 1000000
        starttime = System.nanoTime();
        index=LinearSearchLargeData.linearSearch(largeData3,4);
        System.out.println(index>0? "\n\n\nIndex found at "+index : "\n\n\nIndex not found");;
        endtime = System.nanoTime();
        linearSearchTime = endtime-starttime;
        System.out.println("Time Taken to Perform Linear Search in the Large Data 1000000 : "+(linearSearchTime));


        //Performing the Binary Search on Large Data set of size 1000000
        starttime = System.nanoTime();
        index=BinarySearchLargeData.binarySearch(largeData3,4);
        System.out.println(index>0? "Index found at "+index : "Index not found");
        endtime = System.nanoTime();
        binarySearchTime = endtime-starttime;
        System.out.println("Time Taken to Perform Binary Search in the Large Data 1000000 : "+(binarySearchTime));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        //Printing which is faster
        System.out.println((linearSearchTime>binarySearchTime) ? "\nBinary Search is Faster" : "\n\nLinear Search is Faster");





    }

}
