package org.example.xunhuan;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //1.定义一个数组赋值，使用两种方法循环出数组中的内容
//        int[] a = {1, 2, 3, 4, 5};
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        int j = 0;
//        do {
//            System.out.println(a[j]);
//            j++;
//        } while (j < 5);


        //2.求数组中的最小值，总和，和平均数
//        int[] a = {90, 56, 87, 35, 58, 70};
//        int min = a[0];
//        int sum = 0;
//        int avg;
//        for (int i = 0; i < a.length; i++) {
//            if (min > a[i]) {
//                min = a[i];
//            }
//            sum += a[i];
//        }
//        avg = sum / 6;
//        System.out.println("最小值" + min + "总合" + sum + "平均值" + avg);


        //3.从控制台中输入数，判断有没有
//        int[] a = {8, 14, 20, 18, 23, 34, 12};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入一个数");
//        int input = scanner.nextInt();
//        boolean flag = false;
//        for (int i = 0; i < a.length; i++) {
//            if (input == a[i]) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag == true) {
//            System.out.println("有这个数");
//        } else {
//            System.out.println("没有这个数");
//        }


        //4.录入5个同学的成绩，存入数组，输出最高成绩
//        int[] a = new int[5];
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入5位同学的成绩");
//        for (int i = 0; i < 5; i++) {
//            int b = input.nextInt();
//            a[i] = b;
//        }
//        int max = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (max < a[i]) {
//                max = a[i];
//            }
//        }
//        System.out.println("最高成绩为" + max);



        //5.统计数组中大于0，等于0，小于0的个数
//        int[] a = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入几个数");
//        for (int i = 0; i < 5; i++) {
//            a[i] = scanner.nextInt();
//        }
//        int dayu = 0;
//        int dengyu = 0;
//        int xiaoyu = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > 0) {
//                dayu += 1;
//            } else if (a[i] < 0) {
//                xiaoyu += 1;
//            } else {
//                dengyu += 1;
//            }
//        }
//        System.out.println("大于0的个数" + dayu + "\n" + "小于0的个数" + xiaoyu + "\n" + "等于0的个数" + dengyu);



        //6.定义字符串数组，判断其中含有“hello”字符串的数量
        String[] a = new String[3];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.next();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("hello")) {
                sum += 1;
            }
        }
        System.out.println("含有hello字符串的数量为" + sum);
    }
}
