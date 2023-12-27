package org.example.Class;

import java.util.Scanner;

public class Test004 {
    public static void main(String[] args) {
        Test003 test111 = new Test003();
        Scanner scanner = new Scanner(System.in);
        String name = null;
        do {
            System.out.print("请输入姓名:");
            name = scanner.next();
            if (!"n".equals(name)){
                test111.name = name;
                System.out.print("请输入年龄");
                test111.age = scanner.nextInt();
                test111.piao();
            }else {
                System.out.println("退出程序");
            }
        }while (!"n".equals(name));
    }
}
