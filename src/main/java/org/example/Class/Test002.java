package org.example.Class;

import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test001 test001 = new Test001();
        System.out.print("请输入用户名");
        test001.name = scanner.next();
        System.out.print("请输入密码");
        test001.pwd = scanner.next();

        test001.login();
    }


}
