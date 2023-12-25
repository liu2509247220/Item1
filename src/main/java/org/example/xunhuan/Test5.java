package org.example.xunhuan;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        自加循环
//        int i = 1;
//        int sum = 0;
//        while (i <= 5) {
//            sum += i;
//            i++;
//        }
//        System.out.println(sum);

//        自乘循环
//        int i = 1;
//        int result = 1;
//        while (i <= 5) {
//            result *= i;
//            i++;
//        }
//        System.out.println(result);

        //输入一个数0+6=6
//                1+5=6
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入一个数");
//        int a = input.nextInt();
////        int num = 6;
//        for (int i = 0; i <= a; i++) {
//            System.out.println(i + "+" + (a - i) + "=" + a);
//        }

//        while    do-while     和for计算100以内包括一百的偶数之和
//        while循环100以内的偶数和
//        int i = 0;
//        int sum = 0;
//        while (i <= 100) {
//            sum = sum + i;
//            i = i + 2;
//        }
//        System.out.println(sum);

//        do-while循环100以内的偶数和
//        int i = 0;
//        int sum = 0;
//        do {
//            sum = sum + i;
//            i = i + 2;
//        } while (i <= 100);
//        System.out.println(sum);


//        for循环100以内的偶数和
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);


//        do-while循环成绩是否大于60
//        Scanner input = new Scanner(System.in);
//        int a = 0;
//        do {
//            System.out.println("请上级不安谢晨滚");
//            System.out.println("您的成绩为");
//            a = input.nextInt();
//        } while (a < 60);
//        System.out.println("666");
//


        //普通循环
//        for (int i = 0; i <= 100; i++) {
//            System.out.println("好好学666" + i);
//        }


        Scanner input = new Scanner(System.in);
        //
        double sum = 0;
        System.out.println("输入学生姓名:");
        String name = input.next();
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入5门功课中第" + i + "门课的成绩:");
            int score = input.nextInt();
            sum += score;
        }
        double avg;
        avg = sum / 5;
        System.out.println(name + "平均分为" + avg);

    }
}
