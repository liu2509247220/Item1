package org.example.day1y16IO.zifuliu;

import java.io.FileReader;
import java.io.Reader;

/**
 * @author 86150
 * @date 2024/1/16 13:54
 */
public class TestFileReader {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("D:/1.txt");
            char[] chars = new char[4];
            int len = 0;
            StringBuffer sb = new StringBuffer();
            while ((len = reader.read(chars, 0, chars.length)) > 0) {
                sb.append(new String(chars, 0, len));
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != reader){
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
