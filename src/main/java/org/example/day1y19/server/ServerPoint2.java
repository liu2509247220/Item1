package org.example.day1y19.server;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/19 15:15
 */
public class ServerPoint2 {
    public static void main(String[] args) {

        try {
            //  int port  ,port:端口号
            // 端口号:不能重复，但在不同的计算机中，可以有相同的端口号，因为他们的IP地址不同
            // 端口号范围   0-65535  是2的16次方-1
            // 代表计算机中正在运行的不同进程
            // 获取serverSocket对象
            ServerSocket serverSocket = new ServerSocket(9999);
            // accept:接收 ，接收客户端连接，返回是一个套接字（）socket

            Socket socket = serverSocket.accept();  //阻塞，如果客户端没有连接服务器，代码运行到这阻塞
            // 获取输入流
            InputStream is = socket.getInputStream();

            ObjectInputStream ois = new ObjectInputStream(is);


            Object obj = ois.readObject();
            if (obj instanceof User){
                User user = (User) obj;
                System.out.println(user);

            }
            ois.close();


            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
