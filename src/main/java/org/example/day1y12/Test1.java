package org.example.day1y12;

import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/12 15:00
 */
public class Test1 {
    public static void main(String[] args) {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入用户名");
            String username = scanner.next();
            System.out.println("输入密码");
            String password = scanner.next();
            if (password.length() < 6) {
                System.out.println("密码长度不能小于6");
            } else {
                System.out.println("注册成功");
                break;
            }
        } while (true);
    }
}
