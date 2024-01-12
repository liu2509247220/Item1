package org.example.day1y12;

import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/12 15:03
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            String username = "tom";
            String password = "123456";
            System.out.println("输入用户名");
            String name = scanner.next();
            System.out.println("输入密码");
            String pwd = scanner.next();
            if (username.equalsIgnoreCase(name) && password.equalsIgnoreCase(pwd)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("用户名或密码不陪陪，登陆失败！");
            }
        } while (true);

    }
}
