package org.example.day1y19.server;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/19 14:29
 */
public class ClientPoint {
    public static void main(String[] args) {
        try {

            // String host, int port
            // 本地主机，端口号
            Socket socket = new Socket("localhost",9999);
            // 获取输出流
            OutputStream os = socket.getOutputStream();

//            String str = "123";
//            str.getBytes();
            os.write("admin,123".getBytes());
            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
