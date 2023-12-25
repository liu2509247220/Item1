package org.example.xunhuan;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
//        3.使用if选择结构判断一个整数，属于哪个范围：大于0；小于0；等于0
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入一个数");
//        int n = input.nextInt();
//        if (n>0){
//            System.out.println("整数大于0");
//        } else if (n==0) {
//            System.out.println("整数等于0");
//        }else {
//            System.out.println("整数小于0");
//        }

//        4.使用if选择结构判断一个整数是偶数还是奇数
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入一个数");
//        int a = input.nextInt();
//        if (a % 2 == 1) {
//            System.out.println("为奇数");
//        } else {
//            System.out.println("为偶数");
//        }

//        5.判断此考试成绩为什么等级。
//        90-100之间为优秀
//        80-89之间为优良
//        70-79之间为良好，
//        60-69之间为及格
//        60分以下为不及格
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入成绩");
//        int a = input.nextInt();
//        if (a > 90 && a < 100) {
//            System.out.println("优秀");
//        } else if (a < 89 && a > 80) {
//            System.out.println("优良");
//
//        } else if (a < 79 && a > 70) {
//            System.out.println("良好");
//
//        } else if (a > 60 && a < 69) {
//            System.out.println("及格");
//        } else {
//            System.out.println("不及格");
//        }

//        6.使用条件结构实现：岳灵珊同学参加到Java的学习，他父亲岳不群和母亲宁中则承诺：
//        如果岳灵珊的考试成绩==1OO分，父亲给她买辆车
//        如果岳灵珊的考试成绩>=90分，母亲给她买台笔记本电脑
//        如果岳灵珊的考试成绩>=60分，母亲给她买部手机
//        如果岳灵珊的考试成绩<60分，没有礼物

        Scanner input = new Scanner(System.in);
        System.out.println("输入岳灵珊的考试成绩");
        int a = input.nextInt();
           if (a==100){
               System.out.println("买车");
           } else if (a>=90) {
               System.out.println("笔记本");
           } else if (a>=60) {
               System.out.println("手机");
           }else {
               System.out.println("没有礼物");
           }


    }
}
