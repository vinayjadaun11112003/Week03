package com.recursive_vs_iterative_computation_05;

//FibonacciAndIterativeControllerMain --> This will control the execution of the program
public class FibonacciAndIterativeControllerMain {
    //Main method --> to control the flow of code from here
    public static void main(String[] args){

        //input size of different data set
        int[] input = new int[]{10,30,50};
        long starttime=0;
        long endtime=0;

        //looping the input array and calculating time for each size of input array
        for(int i=0;i<input.length;i++){
            //Fibonacci iterative time
           starttime = System.nanoTime();
           FibonacciIterative.fibonacciIterative(input[i]);
           endtime = System.nanoTime();
           long iterativeTime = endtime-starttime;
           System.out.println("Iterative fibonacci time taken for Data set size of : "+input[i] + " is " +iterativeTime/1e6+"ms");


           //Fibonacci Recursive time
            starttime = System.nanoTime();
            FibonacciRecursive.fibonacciRecursive(input[i]);
            endtime = System.nanoTime();
            long recursiveTime = endtime-starttime;
            System.out.println("Recursive fibonacci time taken for Data set size of : "+input[i] + " is " +recursiveTime/1e6+"ms");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");

        }
    }
}
