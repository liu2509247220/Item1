package org.example.xunhuan;

import java.util.Scanner;

public class Xingxingchengfabiao {
    public static void main(String[] args) {
        //5行5列星星
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();


        //四边形星星
//        for (int i = 1; i <= 5; i++) {
//            for (int x = 1; x <= 5 - i; x++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //三角形星星
//        for (int i = 1; i <= 5; i++) {
//            for (int x = 1; x <= 5 - i; x++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //九九乘法表
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "*" + j + "=" + i * j + "\t");
//            }
//            System.out.println();


        //循环录入5名同学的课程成绩并计算平均，如果录入成绩为负分，则提示录入错误并停止
//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//        double avg = 0;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("输入第" + i + "名同学的分数");
//            int score = input.nextInt();
//            if (score < 0) {
//                break;
//            }
//            sum += score;
//            avg = sum / 5.0;
//        }
//        System.out.println("退出，分数录入错误");
//        System.out.println("总成绩为" + sum + "平均分为" + avg);


        //循环录入Java课的学生成绩，统计高于80分的并计算出80分以上所占比例
        Scanner input = new Scanner(System.in);
        System.out.println("输入班级总人数");
        int sum = input.nextInt();
        int count = 0;
        double avg;
        for (int i = 1; i <= sum; i++) {
            System.out.print("请输入第" + i + "位同学的成绩");
            int score = input.nextInt();
            if (score >= 80) {
                continue;
            }
            count++;
        }
        avg = count * 1.0 / sum * 100;
        System.out.println("分数过80的人有" + count);
        System.out.println("80分以上学生所占比例为" + avg + "%");
    }
}
