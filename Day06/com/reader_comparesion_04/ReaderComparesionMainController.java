package com.reader_comparesion_04;
import java.io.*;
import java.util.*;
//ReaderComparesionMain class --> to control the execution of the code
public class ReaderComparesionMainController {
    //Main method --> to control the flow of code
    public static void main(String[] args) {
    //filepath array with three different filepath
        String[] filePath = new String[]{"C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week03\\Day06\\com\\reader_comparesion_04\\sample.txt", "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week03\\Day06\\com\\reader_comparesion_04\\sample2.txt", "C:\\Users\\HP\\Documents\\Capgemini\\CG-Training\\Week03\\Day06\\com\\reader_comparesion_04\\sample3.txt"}; // Replace with actual file path
        int size = 1;

        //looping for each type of file path
        for (int i = 0; i < filePath.length; i++) {

            System.out.println("Testing FileReader with Large Data Set of :" + size + "mb");
            new FileReaderTest().readFile(filePath[i]);

            System.out.println("\nTesting InputStreamReader with Large Data set of :"+size + "mb");
            new InputStreamReaderTest().readFile(filePath[i]);


            if(i==1){
                size=size*5;
            }else{
                size=size*100;
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        }
    }

}
