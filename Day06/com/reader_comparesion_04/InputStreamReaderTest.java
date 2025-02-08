package com.reader_comparesion_04;
import java.io.*;
//Calculating time of reading in inputstreamreader here
class InputStreamReaderTest {
    public void readFile(String filePath) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            long startTime = System.nanoTime();
            while (inputStreamReader.read() != -1) {
                // Reading byte by byte and converting to characters
            }
            long endTime = System.nanoTime();
            System.out.println("InputStreamReader read time: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
