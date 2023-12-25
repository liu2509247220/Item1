package org.example.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号:");
        int hao = input.nextInt();
        System.out.println("会员卡号是" + hao);
        int ge = hao % 10;
        int shi = hao / 10 % 10;
        int bai = hao / 100 % 10;
        int qian = hao / 1000;
        System.out.println("会员卡号个位数是:" + ge + ";十位数:" + shi + ";百位数:" + bai + ";千位数:" + qian);
        int sum = ge + shi + bai + qian;
        System.out.println("会员卡号" + hao + "各位之和:" + sum);
        System.out.println(sum > 20 ? "恭喜，卡号为" + hao + "的会员，获得Iphone一部" : "嘻嘻参与");
    }
}
