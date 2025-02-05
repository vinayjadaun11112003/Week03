package com.linear_search_problems.search_for_a_specific_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchWord {
    public static int searchWord(String userInput, String word){
        //converting the string into the string array with split option
        String[] arr = userInput.split(" ");

        //ierating the each word of the string array
        int index = -1;
        for(String each : arr){
            ++index;
            if(each.equals(word)){
                return index;
            }
        }
        //returning -1 when word not found
        return -1;
    }
    public static void main(String[] args) throws IOException {
        //Creating object of inputstreamreader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        //Creating the object of the bufferedreader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //taking input of the string
        System.out.println("Enter the String : ");
        String userInput = bufferedReader.readLine();

        //taking input of word to be searched
        System.out.println("Enter the word to be searched : ");
        String word = bufferedReader.readLine();

        //getting the index value of the word by calling the method & storing it into the index
        int index = searchWord(userInput,word);

        //printing the statement according to the condition
        if(index==-1){
            System.out.println("Word not found in the string");
        }else{
            System.out.println("Word found at the index of : "+index);
        }

    }

}
