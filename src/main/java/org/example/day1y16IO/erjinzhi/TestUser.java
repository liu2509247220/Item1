package org.example.day1y16IO.erjinzhi;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author 86150
 * @date 2024/1/17 9:34
 */
public class TestUser {
    public static void main(String[] args) {
        User user = new User("admin", "123", 20);
        ObjectOutputStream oos = null;
        OutputStream os = null;

        try {
            os = new FileOutputStream("D:/user.txt");
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
