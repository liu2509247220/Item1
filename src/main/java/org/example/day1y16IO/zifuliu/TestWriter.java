package org.example.day1y16IO.zifuliu;

import java.io.FileWriter;
import java.io.Writer;

/**
 * @author 86150
 * @date 2024/1/16 17:00
 */
public class TestWriter {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("D:/2.txt");
            String str = "HelloWorld";
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
    }
}
