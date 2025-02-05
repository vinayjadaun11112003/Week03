package org.example.com.input_stream_problems.convert_bytestream_tocharacter_stream;

import java.io.*;

public class InputStreamReaderExample {
    public static String streamConversion(){
        // Path to the input file
        String filePath = "C:\\Users\\HP\\Downloads\\Week03\\Day04\\Day04_Testing\\src\\main\\java\\org\\example\\com\\input_stream_problems\\convert_bytestream_tocharacter_stream\\sample.txt"; // Replace with your file's path

        // Charset used in the file (e.g., UTF-8)
        String charset = "UTF-8";

        try (
                // Step 1: Create a FileInputStream to read the binary data
                FileInputStream fileInputStream = new FileInputStream(filePath);

                // Step 2: Wrap FileInputStream in an InputStreamReader to convert bytes to characters
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);

                // Step 3: Wrap InputStreamReader in a BufferedReader for efficient reading
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            String line;

            // Step 4: Read the file line by line and print each line to the console
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            return "Success";

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            return "something went wrong";
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported encoding: " + charset);
            return "something went wrong";
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return "something went wrong";
        }
    }

    public static void main(String[] args) {
        System.out.println(streamConversion());

    }
}

