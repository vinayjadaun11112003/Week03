package org.example.com.filereader_problems.count_occurance_of_word_with_filereader;

import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static int wordCounter(String filePath,String targetWord,int wordCount){
        try {
            //Creating FileReader and wrap it with BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            //Reading each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                //Spliting the line into words using whitespace and punctuation as delimiters
                String[] words = line.split("\\W+");

                //Checking each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            //Closing resources
            bufferedReader.close();
            fileReader.close();

            //Printing the result
            System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");
            return wordCount;

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return wordCount;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return wordCount;
        }


    }
    public static void main(String[] args) {
        //Taking user input for file path and target word
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter the word to count: ");
        String targetWord = scanner.next();
        scanner.close();

        int wordCount = 0;

        System.out.println(wordCounter(filePath,targetWord,wordCount));



    }
}
