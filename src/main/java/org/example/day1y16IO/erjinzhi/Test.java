package org.example.day1y16IO.erjinzhi;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * @author 86150
 * @date 2024/1/17 9:41
 */
public class Test {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        InputStream is = null;
        try {
            //创建文件输入流用于读取二进制数据
            is = new FileInputStream("D:/user.txt");
            //创建ObjectInputStream对象，用于读取对象数据
            ois = new ObjectInputStream(is);
            //从流中读取对象
            Object obj = ois.readObject();
            //检查对象类型是否为User
            if (obj instanceof User) {
                //将对象转换成User类型
                User user = (User) obj;
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流，释放资源
                if (is != null) {
                    is.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                // 在关闭流时抛出异常，可以选择捕获并处理，也可以继续抛出
                throw new RuntimeException(e);
            }
        }
    }
}
