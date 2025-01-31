package com.selectionsort_examscores;
import java.util.*;
public class SelectionSortScores {

    //SELECTION SORT ALGORITHM
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int m=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
        }
    }



    //main method to control the flow of execution of the program
    public static void main(String[] args) {
        int[] examScores = {85, 92, 78, 65, 89, 76};

        selectionsort(examScores);

        System.out.println("Sorted Scores: " + Arrays.toString(examScores));



    }

}
