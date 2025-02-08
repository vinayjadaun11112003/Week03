package com.compare_different_ds_for_searching_06;


import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
//SearchingDSControllerMain --> To control the execution of the code
public class SeachingDSControllerMain {
    //Main method ---> to control the flow of code
    public static void main(String[] args){
        //input size array
        int[] input=new int[]{1000,10000,1000000};
        long starttime=0;
        long endtime=0;

        //Calculating time for each searching
        for(int i=0;i<input.length;i++){

            //Searching time in array
            int[] array = new int[input[i]];
            Random random = new Random();
            for(int j=0;j<input[i];j++){
                array[i]=random.nextInt();
            }
            starttime=System.nanoTime();
            ArraySearch.searchArray(array,input[i],125000);
            endtime=System.nanoTime();
            long arraySearchingTime=endtime-starttime;
            System.out.println("Array Searching took time : "+arraySearchingTime/1e6+"ms"+ " for Data set of "+input[i]);


            //Searching time in hashset
            HashSet<Integer> hashSet = new HashSet<>();
            for(int j=0;j<input[i];j++){
                hashSet.add(random.nextInt());
            }
            starttime=System.nanoTime();
            HashSetSearch.hashSetSearch(hashSet,157000);
            endtime=System.nanoTime();
            long hashSetSearchingTime=endtime-starttime;
            System.out.println("HashSet Searching took time : "+hashSetSearchingTime/1e6+"ms"+ " for Data set of "+input[i]);


            //Searching in treeset
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int j=0;j<input[i];j++){
                treeSet.add(random.nextInt());
            }
            starttime=System.nanoTime();
            TreeSetSearch.treeSetSearch(treeSet,1002560);
            endtime=System.nanoTime();
            long treeSetSearchingTime=endtime-starttime;
            System.out.println("TreeSet Searching took time : "+treeSetSearchingTime/1e6+"ms"+ " for Data set of "+input[i]);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------\n\n\n");
        }
    }
}
