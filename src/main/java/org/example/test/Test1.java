package org.example.test;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        String name = "小明";
        int age = 25;
        int year = 5;
        int proj = 3;
        int a = 10;
        int b = 20;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        String job = "Java";
        String hobby = "篮球";
        final int Q = 100;
        final int YEAR_DATE_TIME = 1000;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");
        int hao = input.nextInt();
        System.out.println("会员卡号是:" + hao);
        System.out.println(Q);
        System.out.println(YEAR_DATE_TIME);
        System.out.println("这个同学的姓名是:" + name);
        System.out.println("小明年龄是:" + age);
        System.out.println("工作了" + year + "年了");
        System.out.println("做过" + proj + "个项目");
        System.out.println("技术方向是" + job);
        System.out.println("兴趣爱好是:" + hobby);
    }
}
