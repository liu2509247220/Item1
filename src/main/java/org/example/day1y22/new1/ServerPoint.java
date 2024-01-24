package org.example.day1y22.new1;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/22 13:45
 */
public class ServerPoint {
    public static void main(String[] args) {
        try {

            ServerSocket serverSocket = new ServerSocket(9999);
            while (true){
                Socket socket = serverSocket.accept();
                WorkThread workThread = new WorkThread(socket);
                //开启线程
                workThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
