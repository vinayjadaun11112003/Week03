package com.linear_search_problems.search_negative_numbers;

public class SearchNegative {
    public static int  findNegative(int[] arr){
        //Taking index as -1
        int index = -1;

        //Iterating the array
        for(int each : arr){
            ++index;
            if(each<0){
                return index;
            }
        }

        //returning -1 when negative not found in the array
        return -1;
    }
    public static void main(String[] args){
        //Declaring array
        int[] arr = new int[]{-1,2,4,5,66,4,7};

        //getting index of first negative number appearance
        int index = findNegative(arr);


        //printing the index of first negative number appearance
        if(index>=0){
            System.out.println("The first negative value appeared at the index of : "+ index);
        }else{
            System.out.println("Not found");
        }

    }
}
