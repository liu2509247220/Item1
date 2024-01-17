package org.example.day1y16IO.erjinzhi;

import java.io.*;

/**
 * @author 86150
 * @date 2024/1/17 9:11
 */
public class TestCopy {
    public static void main(String[] args) {
        InputStream is = null;
        DataInputStream dis = null;
        OutputStream os = null;
        DataOutputStream dos = null;

        try {
            //创建文件输入流和数据输入流，用于读取二进制数据
            is = new FileInputStream("D:/123.jpg");
            dis = new DataInputStream(is);

            //创建文件输出流和数据输出流，用于写入二进制数据
            os = new FileOutputStream("D:/1.jpg");
            dos = new DataOutputStream(os);
            byte[] bytes = new byte[1024];//使用较大的缓冲区
            int len = 0; //定义len为数组长度
            StringBuffer sb = new StringBuffer();//创建stringBuffer对象（对字符串高效工作、修改）
            //循环读取并写入数据
            while ((len = dis.read(bytes, 0, bytes.length)) != -1) {
                sb.append(new String(bytes, 0, len));
                //使用write方法写入bytes数组
                dos.write(bytes, 0, len);
//                刷新缓冲区
                dos.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
                if (is != null) {
                    is.close();
                }
                if (dos != null) {
                    dos.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
