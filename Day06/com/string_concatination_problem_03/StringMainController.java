package com.string_concatination_problem_03;

//Main Controller class --> To control the execution of code
public class StringMainController {
    //Main method to control the flow of code
    public static void main(String[] args) {
        //count array
        int[] count = new int[]{1000,10000,1000000};

        //looping for each count
        for(int i=0;i<count.length;i++) {


            //Calculating time for String Concatination
            System.out.println("Testing String Concatenation with Large Data Set of :"+count[i]);
            new StringConcatenation().concatenate(count[i]);

            //Calculating time for StringBuilder Concatination
            System.out.println("\nTesting StringBuilder Concatenation with Large Data Set of :"+count[i]);
            new StringBuilderConcatenation().concatenate(count[i]);

            //Calculating time for StringBuffer Concatination
            System.out.println("\nTesting StringBuffer Concatenation with Large Data Set of :" + count[i]);
            new StringBufferConcatenation().concatenate(count[i]);

            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------\n");

        }
    }
}
