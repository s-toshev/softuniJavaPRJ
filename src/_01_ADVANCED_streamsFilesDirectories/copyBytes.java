package _01_ADVANCED_streamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class copyBytes {
    public static void main(String[] args) throws IOException {


        String path = "D:\\Downloads\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("D:\\Downloads\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\out_as_bytes.txt");
        PrintStream out = new PrintStream(outputStream);


        int value = inputStream.read();


        while (value != -1) {

            if(value != 10 && value != 32){
                out.print(value);
            }else {
                out.print((char) value);
            }

            value = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}
