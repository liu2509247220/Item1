package org.example.day1y24.test6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 86150
 * @date 2024/1/24 10:50
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(3);
        list.add(20);
        list.add(12);

        System.out.println("列表内容" + "\n" + list);

        list.remove(1);
        System.out.println("列表内容" + "\n" + list);

        int a = scanner.nextInt();
        boolean contains = list.contains(a);
        System.out.println("是否？" + contains);
    }
}
