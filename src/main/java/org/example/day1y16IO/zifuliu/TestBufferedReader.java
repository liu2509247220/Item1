package org.example.day1y16IO.zifuliu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * @author 86150
 * @date 2024/1/16 16:44
 */
public class TestBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        Reader reader = null;
        try {
            reader = new FileReader("D:/1.txt");
            br = new BufferedReader(reader);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
