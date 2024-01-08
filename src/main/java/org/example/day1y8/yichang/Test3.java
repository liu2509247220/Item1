package org.example.day1y8.yichang;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("请输入1-3之间的数字");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("入门到精通");
                    break;
                case 2:
                    System.out.println("入门到入土");
                    break;
                case 3:
                    System.out.println("再见");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("数字输入错误");
        } finally {
            System.out.println("欢迎提出建议");
        }
    }
}
