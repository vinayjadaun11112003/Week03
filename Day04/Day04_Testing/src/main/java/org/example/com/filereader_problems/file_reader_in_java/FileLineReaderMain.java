package org.example.com.filereader_problems.file_reader_in_java;

import java.io.IOException;

public class FileLineReaderMain {
    public static void main(String[] args) {
        //Specifying the file path
        String filePath = "C:\\Users\\HP\\Downloads\\Week03\\Day04\\com\\file_reader_in_java/sample.txt";
        try {
            //Reading the file and printing its content
            FileLineReader.readFile(filePath);
        } catch (IOException e) {
            //Handling exceptions if file reading fails
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
