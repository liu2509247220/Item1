package org.example.day1y12test;

import java.util.Random;

/**
 * @author 86150
 * @date 2024/1/12 10:00
 */
public class Test5 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(10);
            System.out.print(i1+"\t");
            sum += i1;
        }
        double avg = (double) sum / 10;
        System.out.println("10个随机数的平均值为" + avg);
    }
}
