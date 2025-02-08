package com.reader_comparesion_04;
import java.io.*;

//Calculating time of reading in filereader here
class FileReaderTest {
    public void readFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            long startTime = System.nanoTime();
            while (fileReader.read() != -1) {
                // Reading character by character
            }
            long endTime = System.nanoTime();
            System.out.println("FileReader read time: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
