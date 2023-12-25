package org.example.xunhuan;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int zheng = input.nextInt();
        switch (zheng){
            case 1:
                System.out.println("大娃");
                break;
            case 2:
                System.out.println("二娃");
                break;
            case 3:
                System.out.println("三娃");
                break;
            case 4:
                System.out.println("四娃");
                break;
            case 5:
                System.out.println("五娃");
                break;
            default:
                System.out.println("北京欢迎你");

        }
    }
}
