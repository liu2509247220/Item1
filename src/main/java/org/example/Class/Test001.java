package org.example.Class;

import java.util.Scanner;

public class Test001 {
    String name;
    String pwd;

    public void login(){
        if ("admin".equals(name)&&"123456".equals(pwd)){
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入新密码:");
            pwd = scanner.next();
            System.out.println("修改密码成功，您的密码为"+pwd);
        }else {
            System.out.println("用户名和密码不匹配");
        }
    }
}
