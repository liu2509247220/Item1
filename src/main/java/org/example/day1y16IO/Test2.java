package org.example.day1y16IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author 86150
 * @date 2024/1/16 9:20
 */
public class Test2 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {

            is = new FileInputStream("D:/123.txt");
            os = new FileOutputStream("D:/2.txt");
            byte[] bytes = new byte[4];
            int len;
            StringBuilder sb = new StringBuilder();
            //循环边读取边写
            while ((len = is.read(bytes, 0, bytes.length)) > 0) {
                sb.append(new String(bytes, 0, len));
                os.write(bytes,0,len);
            }
//            is.read();
            System.out.println(sb);
            os.flush();
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
            try {
                if (null != os) {
                    os.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
