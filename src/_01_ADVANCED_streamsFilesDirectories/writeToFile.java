package _01_ADVANCED_streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class writeToFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Downloads\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("D:\\Downloads\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\out.txt");
        int value = inputStream.read();
        Set<Character> punctuations = Set.of(',', '.', '!', '?');
        while (value != -1) {
            char current = (char) value;
            if (!punctuations.contains(current)) {
                outputStream.write(current);
            }
            value = inputStream.read();
        }
       inputStream.close();
        outputStream.close();
    }
    }
