package com.filereader_problems.file_reader_in_java;

import java.io.*;

//Class to read a file line by line using FileReader

class FileLineReader {

    //Method to read a file line by line and print each line
    public static void readFile(String filePath) throws IOException {
        //Creating a FileReader object to read the file
        FileReader fileReader = new FileReader(filePath);

        //Wrapping FileReader in BufferedReader for efficient reading
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //Variable to store each line read from the file
        String line;

        //Reading each line from the file until the end is reached
        while ((line = bufferedReader.readLine()) != null) {
            // Printing the current line to the console
            System.out.println(line);
        }

        //Closing the BufferedReader to release resources
        bufferedReader.close();
    }


}