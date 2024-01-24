package org.example.day1y19.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author 86150
 * @date 2024/1/19 10:36
 */
public class Test3 {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "12", 6);
        ObjectOutputStream oos = null;
        OutputStream os = null;
        try {
            os = new FileOutputStream("D:/admin.txt");
            oos = new ObjectOutputStream(os);
            oos.writeObject(admin);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (os != null){
                    os.close();
                }
                if (oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
