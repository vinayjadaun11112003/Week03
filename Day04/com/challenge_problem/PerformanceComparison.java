package com.challenge_problem;

import java.io.*;


public class PerformanceComparison {

    // Part 1:Comparing StringBuilder and StringBuffer for concatenation
    public static void compareStringConcatenation() {
        // Test with StringBuilder
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append("test");
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " nanoseconds");

        // Test with StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            stringBuffer.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken using StringBuffer: " + (endTime - startTime) + " nanoseconds");
    }

    // Part 2:Counting the number of words in a large file using FileReader and InputStreamReader
    public static void countWordsInFile(String filePath) {
        long startTime = System.nanoTime();

        try (FileInputStream fileReader = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileReader);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            int wordCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words based on spaces and count them
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            long endTime = System.nanoTime();
            System.out.println("Word count: " + wordCount);
            System.out.println("Time taken to read file and count words: " + (endTime - startTime) + " nanoseconds");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Compare StringBuilder and StringBuffer concatenation
        compareStringConcatenation();

        // Specify the path to a large file (100MB or more)
        // For demonstration, make sure the file exists at the given path
        String filePath = "C:/Users/HP/Downloads/Week03/Day04/com//challenge_problem/100mb.txt";  // Modify this path to your file location

        // Count words in the large file
        countWordsInFile(filePath);
    }
}
