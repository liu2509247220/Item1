package org.example.day1y12;

import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/12 15:33
 */
public class Test5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***欢迎进入注册系统***");
        try {
            do {
                System.out.println("输入用户名");
                String username = scanner.next();
                System.out.println("输入密码");
                String pwd1 = scanner.next();
                System.out.println("再输入密码");
                String pwd2 = scanner.next();
                if (username.length() < 3 || pwd1.length() < 6 || pwd2.length() < 6) {
                    System.out.println("用户名长度不能小于3，妈妈长度不能小于6");

                } else if (!pwd1.equals(pwd2)) {
                    System.out.println("两次输入的密码不同");
                } else {
                    System.out.println("注册成功");
                    break;
                }
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
