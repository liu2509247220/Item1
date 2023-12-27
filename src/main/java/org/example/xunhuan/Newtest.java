package org.example.xunhuan;

import java.util.Scanner;

public class Newtest {
    public static void main(String[] args) {
//        double[] yuan = new double[5];
//        System.out.println("请输入会员本月的消费记录");
//        Scanner scanner = new Scanner(System.in);
//        double sum = 0;
//        for (int i = 0; i < yuan.length; i++) {
//            System.out.print("请输入第" + (i + 1) + "笔购物金额");
//            yuan[i] = scanner.nextDouble();
//            sum += yuan[i];
//        }
//        System.out.println("序号" + "\t\t\t" + "金额（元）");
//        for (int i = 0; i < yuan.length; i++) {
//            System.out.println((i + 1) + "\t\t\t" + yuan[i]);
//        }
//        System.out.println("总金额" + "\t\t" + sum);


//        int[] score = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入五个数");
//        for (int i = 0; i < score.length; i++) {
//            score[i] = scanner.nextInt();
//        }
//        int max = score[0];
//        int min = score[0];
//        for (int i = 0; i < score.length; i++) {
//            if (max < score[i]) {
//                max = score[i];
//            }
//        }
//        for (int i = 0; i < score.length; i++) {
//            if (min > score[i]) {
//                min = score[i];
//            }
//        }
//        System.out.println("zuida"+max+"\t"+"zuixiao"+min);


        int[][] scores = {{12,23},{78,89}};
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
