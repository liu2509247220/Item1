package org.example.day1y24.test3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/24 10:23
 */
public class Test3s {
    public static void main(String[] args) {
        try {

            ServerSocket serverSocket = new ServerSocket(123);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();

            String line = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                System.out.println("客户端" + line);
            }
            is.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
