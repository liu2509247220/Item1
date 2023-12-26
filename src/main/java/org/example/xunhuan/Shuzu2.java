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


        int[] score;
        score = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入五个数");
        for (int j = 0; j < score.length; j++) {
            score[j] = scanner.nextInt();
        }
        int max = score[0];
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println("最大数" + max + "\t" + "最小数" + min);


        /**
         * 有一组学员的成绩{99.85.82.63.60}
         * 将他们降序排列，要增加一名学员的成绩
         * 将他插入序列，并保持降序
         * 思路：将成绩保存在数组中
         * 通过比较找到插入位置
         * 该位置元素向后移动一位
         * 插入新成绩
         * @author m1991
         */
//        int[] scores = {90, 85, 82, 63, 60, 0};
//        //定义插入的成绩
//        int score = 88;
//        //定义插入位置
//        int index = 0;
        //下面寻找可以插入的光标位置，从后面向前比较
//        for (int i = scores.length - 2; i >= 0; i--) {
//            if (score > scores[i]) {    //如果插入的数大于当前比较的数
//                scores[i + 1] = scores[i];   //把当前的这个数向后放
//            } else {
//                //将当前的位置赋值给index
//                index = i;
//                break;
//            }
//        }
//        //在index+1的位置把score插入
//        scores[index + 1] = score;
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i] + "\t");
//        }
    }
}
