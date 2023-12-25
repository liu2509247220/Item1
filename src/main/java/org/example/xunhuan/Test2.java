package org.example.xunhuan;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        1.读入一个整数，表示一个人的年龄。
//        如果小于6岁，则输出“儿童”，
//        6岁到13岁，输出“少儿”；
//        14岁到17岁，输出“青少年”；
//        18岁到35岁，输出“青年”；
//        36岁到50岁，输出“中年”；
//        50岁以上输出“中老年”。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = input.nextByte();
        if (age > 0 && age < 6) {
            System.out.println("儿童");
        } else if (6 < age && age < 13) {
            System.out.println("少儿");
        } else if (14 < age && age < 17) {
            System.out.println("青少年");
        } else if (18 < age && age < 35) {
            System.out.println("青年");
        } else if (36 < age && age < 50) {
            System.out.println("中年");
        } else if(age >= 50) {
            System.out.println("中老年");
        }

    }
}
