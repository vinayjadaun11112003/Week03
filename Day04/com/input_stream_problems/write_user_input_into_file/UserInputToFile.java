package com.input_stream_problems.write_user_input_into_file;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        //Defining the file name where the input will be written
        String fileName = "user_input.txt";

        //Using try-with-resources to ensure resources are properly closed
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(fileName, true); // 'true' to append to the file
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String userInput;
            System.out.println("Enter text (type 'exit' to stop):");

            //Continuously read user input
            while (true) {
                userInput = bufferedReader.readLine();

                //Checking if the user typed "exit"
                if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }

                //Writing the input to the file, followed by a new line
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
            }

            System.out.println("Input saved to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

