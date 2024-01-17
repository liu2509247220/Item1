package org.example.day1y16IO.zifuliu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @author 86150
 * @date 2024/1/16 17:15
 */
public class TestBufferedWriter {
    public static void main(String[] args) {
        Writer writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter("D:/4.txt");
            bw = new BufferedWriter(writer);
            String str = "Hello";
            bw.write(str);
            bw.flush();
            writer.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
