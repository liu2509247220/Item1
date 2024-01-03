package org.example.xunhuan;

import java.util.Scanner;

public class Shuzu {
    public static void main(String[] args) {
//        int [ ] a ={8,4,2,1,23,344,12};
//        System.out.println(a);
        int[] arr = new int[]{8, 4, 2, 1, 23, 344, 12};
        int[] c = {8, 4, 2, 1, 23, 344, 12};
        // 利用循环实处每一个元素的值
        for (int j = 0; j <= 5; j++) {
            for (int i = 0; i < arr.length; i++)//数组名.length就是数组长度
            {
                System.out.print(arr[i] + " ");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组和为:" + sum);
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数:");
        int a = input.nextInt();

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("存在");
        } else {
            System.out.println("不存在");
        }
    }
}

/**
 * 数组的三种定义方法
 *
 * 1.数组类型[] 数组名=new 数组类型[数组长度];
 * 2.数组类型[] 数组名={数组0,数组1,数组2,数组3,....};
 * 3.数组类型[] 数组名=new 数组类型[]{数组0,数组1,数组2,...};
 * */

//public class WhatEver {
//    public static void main(String[] args) {
//        //第一种	例:
//        String[] test1 = new String[6];
//        test1[0] = "数组0";
//        test1[1] = "数组1";
//
//
//        //第二种 例:
//        String[] test2 = {"数组0","数组1","数组2","...."};
//
//        //第三种 例:
//        String[] test3 = new String[]{"数组0","数组1","数组2","...."};
//
//
//
//    }
//}