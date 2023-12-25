package org.example.xunhuan;

import java.util.Scanner;

public class Shuzu2 {
    public static void main(String[] args) {
//        double[] yuan = new double[5];
//        System.out.println("请输入会员本月的消费记录");
//        Scanner input = new Scanner(System.in);
//        double sum = 0;
//        for (int i = 0; i < yuan.length; i++) {
//            System.out.print("请输入第" + (i + 1) + "笔购物金额:");
//            yuan[i] = input.nextDouble();
//            sum += yuan[i];
//        }
//        System.out.println("序号" + "\t\t\t" + "金额(元)");
//        for (int i = 0; i < yuan.length; i++) {
//            System.out.println((i + 1) + "\t\t\t" + yuan[i]);
//        }
//        System.out.println("总金额" + "\t\t" + sum);


//        int[] score = {100, 120, 80, 60, 70};
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
//        System.out.println(max + "\t" + min);


        /**
         * 有一组学员的成绩{99.85.82.63.60}
         * 将他们降序排列，要增加一名学员的成绩
         * 将他插入序列，并保持降序
         * 思路：将成绩保存在数组中
         * 通过比较找到插入位置
         * 该位置元素向后移动一位
         * 插入新成绩
         * @author m1991
         *
         */
        int[] scores = {90, 85, 82, 63, 60, 0};
        //定义插入的成绩
        int score = 88;
        //定义插入位置
        int index = 0;
        for (int i = scores.length - 2; i >= 0; i--) {
            if (score > scores[i]) {
                scores[i + 1] = scores[i];
            } else {
                //将当前的位置赋值给index
                index = i;
                break;
            }
        }
        //在index+1的位置把score插入
        scores[index + 1] = score;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "\t");
        }
    }
}
