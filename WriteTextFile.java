package com.tripillar.filehandling.text;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

    public static void main(String[] args) {
        String filePath = "output.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, this is a sample text written to the file.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
