package org.example.day1y19.server;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/19 15:16
 */
public class ClientPoint2 {
    public static void main(String[] args) {
        try {

            // String host, int port
            // 本地主机，端口号
            Socket socket = new Socket("localhost", 9999);
            // 获取输出流
            OutputStream os = socket.getOutputStream();


            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(new User("admin", "123"));
            oos.close();


            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
