package org.example.xunhuan;

import java.util.Scanner;


public class Test7 {
    public static void main(String[] args) {

        //1~10之间的整数相加，得到累加值为20的当前数

//        int i = 1;
//        int sum = 0;
//        while (i <= 10) {
//            sum += i;
//            if (sum > 20) {
//                break;
//            }
//            i++;
//        }
//        System.out.println(sum);
//        System.out.println(i);

        //求1~10之间所有偶数和
//        int i = 1;
//        int sum = 0;
//        while (i <= 10) {
//            i++;
//            if ((i % 2) == 1) {
//                continue;
//            }
//            sum += i;
//        }
//        System.out.println("偶数和为" + sum);

        Scanner input = new Scanner(System.in);
        do {


            System.out.println("输入一个1-7之间的数,输入0退出");
            int a = input.nextInt();
            if (a == 0) {
                System.out.println("程序结束");
            } else if (a >= 1 && a <= 7) {

                switch (a) {
                    case 1:
                        System.out.println("星期一");
                        break;
                    case 2:
                        System.out.println("星期二");
                        break;
                    case 3:
                        System.out.println("星期三");
                        break;
                    case 4:
                        System.out.println("星期四");
                        break;
                    case 5:
                        System.out.println("星期五");
                        break;
                    case 6:
                        System.out.println("星期六");
                        break;
                    case 7:
                        System.out.println("星期日");
                        break;
                }
            } else {
                System.out.println("输入的数字不符合，重新输入");
            }
        } while (true);

    }
}
