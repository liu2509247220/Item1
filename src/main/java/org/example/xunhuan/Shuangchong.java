package org.example.xunhuan;

import java.util.Scanner;

public class Shuangchong {
    public static void main(String[] args) {
//        1.
        int[][] scores = {{12,15,32,41},{14,54,87,231},{12}};
        //定义多维数组并输出
//        int[][] scores = new int[3][5];
//        scores[0][0] = 90;
//        scores[1][2] = 100;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }

//        2.
//        int[][] scores = new int[3][5];//三个班每个班5个人输入分数并计算每个班总分
//        int[] sum = new int[3];//定义一个数组来接收每个班总成绩
//
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("**********第" + (i + 1) + "个班***********");
//            for (int j = 0; j < scores[i].length; j++) {
//                System.out.print("请输入第" + (j + 1) + "个学生的成绩:");
//                scores[i][j] = scanner.nextInt();
//                sum[i] += scores[i][j];//计算每个班总成绩
//            }
//        }
////        for (int i = 0; i < scores.length; i++) {
////            for (int j = 0; j < scores[i].length; j++) {
////                sum[i] += scores[i][j];
////            }
////        }
//        System.out.println("**********成绩统计**********");
//        for (int i = 0; i < sum.length; i++) {
//            System.out.println((i + 1) + "班总成绩:" + sum[i]);//循环输出
//        }
    }
}
