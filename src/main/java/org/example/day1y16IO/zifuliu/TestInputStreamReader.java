package org.example.day1y16IO.zifuliu;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestInputStreamReader {
    public static void main(String[] args) {
        InputStream is = null;
        Reader reader = null;
        try {
            // 打开文件输入流，用于读取文件数据
            is = new FileInputStream("D:/1.txt");

            // 创建InputStreamReader对象，将字节流转换为字符流，指定字符编码为UTF-8
            reader = new InputStreamReader(is, "UTF-8");

            // 创建字符数组，用于缓存每次读取的字符数据
            char[] chars = new char[4];

            int len = 0;  // 用于记录实际读取的字符数
            StringBuffer sb = new StringBuffer();  // 用于存储读取的字符数据

            // 循环读取文件内容
            while ((len = reader.read(chars, 0, chars.length)) > 0) {
                // 将字符数组中的数据转换为字符串并追加到字符串缓冲区中
                sb.append(new String(chars, 0, len));
            }

            // 输出读取的文件内容
            System.out.println(sb.toString());

        } catch (Exception e) {
            // 捕获可能抛出的异常，并打印异常信息
            e.printStackTrace();
        } finally {
            try {
                // 关闭文件输入流
                if (null != is) {
                    is.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                // 关闭字符流
                if (null != reader) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
