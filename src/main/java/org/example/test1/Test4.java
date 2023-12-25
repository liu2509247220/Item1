package org.example.test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = input.nextInt();
        System.out.println(age > 18 ? "成年人" : "未成年");

        double num = 8.88;
        System.out.println((int)num);
        final float pi = (float) 3.14;
        // 定义一个常量名为PI，并赋值3.14
        float PI = 3.14f;
        // 定义一个float类型的变量并初始化为3.14
        // 定义一个double类型的变量名为num，值为8.88，并强制转换为int类型

        int a = 8;
        int b = 9;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
