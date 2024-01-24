package org.example.day1y19.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/22 10:22
 */
public class SP {
    public static void main(String[] args) {
        try {

            ServerSocket serverSocket = new ServerSocket(123);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();

            String line = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                System.out.println("来自客户端" + line);
            }


            OutputStream os = socket.getOutputStream();
            os.write("登陆成功".getBytes());
            os.close();


            is.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
