package _01_ADVANCED_streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Downloads\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

       int value = inputStream.read();

       while (value!=-1){
           System.out.print(Integer.toBinaryString(value) + " ");
           value=inputStream.read();
       }
    }
}
