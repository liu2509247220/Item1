package org.example.day1y19.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * @author 86150
 * @date 2024/1/19 11:28
 */
public class New {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        InputStream is =null;
        try {
            is = new FileInputStream("D:/admin.txt");
            ois = new ObjectInputStream(is);
            Object obj = ois.readObject();
            if (obj instanceof Admin){
                Admin admin = (Admin) obj;
                System.out.println(admin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (is != null){
                    is.close();
                }
                if (ois != null){
                    ois.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
