package org.example.day1y19.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/22 10:22
 */
public class CP {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 123);
            OutputStream os = socket.getOutputStream();
            os.write("admin,123".getBytes());

            //关闭状态
            socket.shutdownOutput();

            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
