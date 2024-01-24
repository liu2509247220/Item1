package org.example.day1y22.new1;

import org.example.day1y19.server.User;

import java.io.*;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/22 13:47
 */
public class ClientPoint {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(new User("admin", "123"));

            socket.shutdownOutput();

            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


            br.close();
            is.close();
            oos.close();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
