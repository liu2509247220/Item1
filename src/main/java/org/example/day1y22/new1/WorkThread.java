package org.example.day1y22.new1;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 86150
 * @date 2024/1/22 11:28
 */
public class WorkThread extends Thread {
    private Socket socket;

    public WorkThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            Object obj = ois.readObject();
            String str = "";
            if (obj instanceof User) {
                User user = (User) obj;
                if ("admin".equals(user.getUsername()) && "123".equals(user.getPassword())) {
                    str = Thread.currentThread().getName() + "登陆成功";

                } else {
                    str = Thread.currentThread().getName() + "登陆失败";
                }
            }
            OutputStream os = socket.getOutputStream();
            os.write(str.getBytes());

            os.close();
            ois.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
