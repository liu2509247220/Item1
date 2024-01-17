package org.example.day1y16IO;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author 86150
 * @date 2024/1/16 9:27
 */
public class TestInputStream {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("D:/4321.txt");
            byte[] bytes = new byte[4];
            int len = 0;
            StringBuffer sb = new StringBuffer();
            while ((len = is.read(bytes, 0, bytes.length)) > 0) {
                sb.append(new String(bytes, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is) {
                    is.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
