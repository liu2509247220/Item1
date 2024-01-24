package org.example.day1y24.test3;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/24 10:23
 */
public class Test3c {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 123);
            OutputStream os = socket.getOutputStream();
            os.write("admin,123".getBytes());
            socket.shutdownOutput();


            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
