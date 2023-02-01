package _01_ADVANCED_streamsFilesDirectories;

import java.io.*;
import java.util.Scanner;

public class writeEveryThirdLine_buffer {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Downloads\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        BufferedWriter writer = new BufferedWriter(new PrintWriter("out_thirdline.txt"));

        String line = reader.readLine();

        int count = 1;

        while (line != null) {
            if (count % 3 == 0) {
                writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }

        writer.flush();
    }
}
