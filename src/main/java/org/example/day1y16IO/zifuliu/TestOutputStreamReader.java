package org.example.day1y16IO.zifuliu;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author 86150
 * @date 2024/1/16 17:10
 */
public class TestOutputStreamReader {
    public static void main(String[] args) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        try {
            os = new FileOutputStream("D:/3.txt");
            osw = new OutputStreamWriter(os);
            String str = "World";
            osw.write(str);
            osw.flush();
            os.close();
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
