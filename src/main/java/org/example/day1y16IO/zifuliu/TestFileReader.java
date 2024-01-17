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
            //创建字符流，读取文件内容
            reader = new FileReader("D:/1.txt");
            //创建字符数组，缓存每次从输入流读取的字符数据
            char[] chars = new char[4];
            //用于记录实际读取的字符数
            int len = 0;
            //用于存储读取的字符数据
            StringBuffer sb = new StringBuffer();
            //循环读文件的内容
            while ((len = reader.read(chars, 0, chars.length)) > 0) {
                //将字符数组中的数据转化为字符串追加到字符串缓冲区中
                sb.append(new String(chars, 0, len));
            }
            //输出读取的文件内容
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
